import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formsampleservlet")
public class FormSampleServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String genter = req.getParameter("gender");
		
		String errMsg = "";
		if(name == null || name.length() == 0) {
			errMsg += "名前がないです<br>";
		}
		if(genter == null || genter.length() == 0) {
			errMsg += "性別の選択がされていません<br>";
		} else {
			if(genter.equals("0")) { genter = "男性"; }
			else if(genter.equals("1")) { genter = "女性"; }
		}
		
		String message = name + "さん(" + genter + ")を登録しました";
		if(errMsg.length() != 0) {
			message = errMsg;
		}
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>"+ message +"</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}