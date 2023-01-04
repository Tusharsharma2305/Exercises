package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dbcon.DBConnect;
import com.entity.User;

@WebServlet("/update")
public class UserUpdate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String address = req.getParameter("address");
			
			String phone = req.getParameter("phone");
			String password = req.getParameter("password");
			
			
			
			HttpSession session = req.getSession();
			
            User u = (User) session.getAttribute("userObj");
//            user.setEmail(email);
            u.setName(name);
            u.setPassword(password);
            u.setAge(age);
            u.setPhone(phone);
            u.setAddress(address);
            
            UserDao dao = new UserDao(DBConnect.getConnection());
            
            boolean ans = dao.update(u);
			
			if(ans) {
				session.setAttribute("sucMsg", "Updated");
				resp.sendRedirect("index.jsp");
			}else {
				session.setAttribute("errorMsg", "Something went Wrong");
				resp.sendRedirect("index.jsp");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
