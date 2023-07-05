import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Hello extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8;");
		PrintWriter page = res.getWriter();
		page.println("<!DOCTYPE html>");
		page.println("<html>");
		page.println("<head>");
		page.println("<title>test page home</title>");
		page.println("</head>");
		page.println("<body>");
		page.println("<a href='/servlet-jsp/form/'>go to form</a>");
		page.println("</body>");
		page.println("</html>");
	}
}