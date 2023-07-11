package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.LoginService;
import models.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "/WEB-INF/jsp/loginFail.jsp";
		
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		do {
			
			if(name == null || name.isBlank() || password ==null || password.isBlank()) {
				break;
			}
			
			User user = new User(name, password);
			req.getSession().setAttribute("user", user);
			path = LoginService.loginCheck(user) ? "/WEB-INF/jsp/loginResult.jsp" : path;
			
		} while (false);

		req.getRequestDispatcher(path).forward(req, res);
	}
}