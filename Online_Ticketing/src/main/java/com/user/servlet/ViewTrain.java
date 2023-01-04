package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/viewtrain")
public class ViewTrain extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	     PrintWriter out =resp.getWriter();
		String from=req.getParameter("from");
		String to=req.getParameter("to");
//		String odate = req.getParameter("odate");
//		SimpleDateFormat ft = new SimpleDateFormat ("YYYY_MM_DD_DASH");
//		String d = ft.format(odate);
//		String rdate = req.getParameter("rdate");
//		
//		String rd = ft.format(rdate);
		try {
		Class.forName("org.postgresql.Driver");//Load the driver to JVM
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/onlinedb", "postgres", "Password");
		PreparedStatement ps=con.prepareStatement("SELECT * FROM train where (src=? and dest=?) ");
		
		ps.setString(1, from);
		ps.setString(2, to);
		
		ResultSet rs=ps.executeQuery();
		//PrintWriter out=response.getWriter();
//		out.print("<style>\r\n"
//				+ "      body {\r\n"
//				+ "         background-color: green;\r\n"
//				+ "      }\r\n"
//				+ "   </style>");
		out.print("<style>\r\n"
				+ "body {\r\n"
				+ "  background-image: url('img/home.jpg');\r\n"
				+ "  background-repeat: no-repeat;\r\n"
				+ "  background-attachment: fixed;\r\n"
				+ "  background-size: 100% 100%;\r\n"
				+ "}\r\n"
				+ "</style>");
		out.print("<h3 style=\"color:red\" align=\"center\">Display All Trains</h3>");
		out.print("<html><body><table border='5px solid black' align=\"center\" ><tr><th>Vehicle_ID</th><th>Vehicle_Type</th><th>Usual_Departure_Time(24hr format)</th><th>Route</th><th>Time_Taken</th>");
		while(rs.next()) {
			out.print("<tr><td>");
			out.print(rs.getInt(1));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(2));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(3));
			out.print("</td>");
			out.print("<td>");
			out.print(rs.getString(4));
			out.print("</td>");
			
			out.print("<td>");
			out.print(rs.getString(5));
			out.print("</td>");
			
			out.print("</tr>");
			
		}
		
		out.print("</table></body></html>");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
