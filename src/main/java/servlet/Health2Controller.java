package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Health2;
import models.Health2_Service;

@WebServlet("/health2")
public class Health2Controller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = "/WEB-INF/jsp/health2Form.jsp";
		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = "/WEB-INF/jsp/health2.jsp";

		request.setCharacterEncoding("UTF-8");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		if(height == null || height.length() == 0) { path = "/WEB-INF/jsp/error/"; }
		if(weight == null || weight.length() == 0) { path = "/WEB-INF/jsp/error/"; }
		double dbHeight=0;
		double dbWeight=0;
		
		try {
			dbHeight = Double.parseDouble(height);
			dbWeight = Double.parseDouble(weight);
		} catch (NumberFormatException e) {
			path = "/WEB-INF/jsp/error/";
		}

		Health2 h = new Health2(dbHeight, dbWeight);
		Health2_Service s = new Health2_Service(h);
		
		request.setAttribute("h", h);

		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
		
	}
}