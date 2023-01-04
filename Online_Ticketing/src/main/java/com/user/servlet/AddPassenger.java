package com.user.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.PassengerDao;
import com.entity.Member;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String phone = request.getParameter("phno");
		String aadhar= request.getParameter("aadharnumber");
		String address= request.getParameter("address");
		
	
		
		Member member = new Member(fullname, phone,aadhar, address);
		
		PassengerDao pDao = new PassengerDao();
		String result = pDao.insert(member);
		response.getWriter().print(result);
	}

}
