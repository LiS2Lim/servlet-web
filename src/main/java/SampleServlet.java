import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet{
	private static final long serialViersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String[] luckArray = {"超すっきり","すっきり","最悪"};
		int ran = (int)(Math.random() * 3);
		String luck = luckArray[ran];
		
		String today = new SimpleDateFormat("MM月dd日").format(new Date());
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>すっきり占い</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>");
		pw.printf("%sの運勢は「%s」です。",today,luck);
		pw.println("</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
