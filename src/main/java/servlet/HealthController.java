package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Health;

@WebServlet("/health")
public class HealthController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = "/WEB-INF/jsp/healthForm.jsp";
		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = "/WEB-INF/jsp/health.jsp";

		request.setCharacterEncoding("UTF-8");
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		Health h = new Health();
		double dblWeight = 0.0;
		double dblHeight = 0.0;
		
		try {
			dblWeight = Double.parseDouble(weight);
			dblHeight = Double.parseDouble(height);
			h.setTall(dblHeight);
			h.setWeit(dblWeight);
			request.setAttribute("h", h);
		} catch(NullPointerException ex) {
			System.err.println("data is null");
			path = "/WEB-INF/error/";
		} catch(NumberFormatException ex) {
			System.err.println("data is not double");
			path = "/WEB-INF/error/";
		}
		
		RequestDispatcher d = request.getRequestDispatcher(path);
		d.forward(request, response);
		
	}
}