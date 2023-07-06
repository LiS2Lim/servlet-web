package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Bean;

@WebServlet("/luck")
public class LuckController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		Bean b = new Bean();
		b.setContent("Java Beansの利用練習");
		req.setAttribute("result", b);
		
		RequestDispatcher d = req.getRequestDispatcher("/WEB-INF/jsp/luck/");
		d.forward(req, res);

	}
}