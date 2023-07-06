package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String dispatchPath = "/WEB-INF/jsp/form/";

		RequestDispatcher dispatcher = req.getRequestDispatcher(dispatchPath);
		dispatcher.forward(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String dispatchPath = "/WEB-INF/jsp/sample/";

		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		
		if(name == null || name.length() == 0) {
			dispatchPath = "/WEB-INF/jsp/error/";
		} else if(gender == null || gender.length() == 0) {
			dispatchPath = "/WEB-INF/jsp/error/";
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(dispatchPath);
		dispatcher.forward(req,res);
	}
}