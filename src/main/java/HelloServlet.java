import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String[] strs = {"luck","very luck","bad"};
		String result = strs[(int)(Math.random() * 3)];
		String tody = new SimpleDateFormat("MM/dd").format(new Date());

		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang='ja'");
		pw.println("<head>");
		pw.println("<title>hello</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Hello servlet</h1>");
		pw.println("<p>" + tody + "の運勢は「" + result + "」です</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}