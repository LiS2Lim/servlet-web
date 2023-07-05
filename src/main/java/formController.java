import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class formController extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		
		if(name == null || name.length() == 0) {
			name = "unknown";
		}
		
		res.setContentType("text/html; charset=UTF-8;");
		PrintWriter page = res.getWriter();
		page.println("<html>");
		page.println("<head>");
		page.println("</head>");
		page.println("<body>");
		page.println("<h1>"+ name +"</h1>");
		page.println("</body>");
		page.println("</html>");
	}
}