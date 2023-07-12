package servlet;

import static models.DBconfig.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/select")
public class SelectEmployeeSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			Class.forName(DB_DRIVER);
		} catch(Exception e) {
			System.out.println("class not found");
		}

		Statement st = null;
		ResultSet rs = null;

		try(Connection conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PASSWORD)) {
			st = conn.createStatement();
	        rs = st.executeQuery("SELECT * FROM aptitute");
	        while (rs.next()) {
	            System.out.print(rs.getString(1));
	            System.out.print(rs.getString(2));
	            System.out.print(rs.getString(3));
	            System.out.print(rs.getString(4));
	            System.out.print(rs.getString(5));
	            System.out.print(rs.getString(6));
	            System.out.print(rs.getString(7));
	            System.out.println("");
	        }
			
		} catch(SQLException e) {
			System.out.println("connection error");
			e.printStackTrace();
		} finally {
			try {
				st.close();
				rs.close();
			} catch(Exception e) {
				System.out.println("close error");
			}
		}
	}
}