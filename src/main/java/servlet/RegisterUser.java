package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;
import models.UserRegisterService;

@WebServlet("/register")
public class RegisterUser extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		String path =  "/WEB-INF/jsp/registerForm.jsp";
		
		String action = request.getParameter("action");
		if(action != null && action.equals("done")) {
			new UserRegisterService((User)request.getSession().getAttribute("user"));
			request.getSession().removeAttribute("user");
			path = "/WEB-INF/jsp/registerDone.jsp";
		}
		
		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		String path =  "/WEB-INF/jsp/registerConfirm.jsp";
		
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		String userName = request.getParameter("userName");
		
		List<String> error = new ArrayList<>();
		if(userId == null || userId.length() == 0) { 
			error.add("User IDを確認してください");
		}
		if(userPassword == null || userPassword.length() == 0) { 
			error.add("User Passwordを確認してください"); 
		}
		if(userName == null || userName.length() == 0) { 
			error.add("User Nameを確認してください"); 
		}
		
		if(error.size() > 0) {
			request.setAttribute("error", error);
			path = "/WEB-INF/jsp/error.jsp";
		} else {
			User user = new User(userId, userPassword, userName);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}
		
		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
	}
}