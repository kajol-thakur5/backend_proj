package com.proj_login.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class dashboardservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
		
        resp.setContentType("text/html");
		HttpSession session=req.getSession(false);
	    
		if(session!=null) {
			String userName = (String) session.getAttribute("key");
			
			if(userName!=null) {
				out.print("user exist: "+ userName);
				out.print("<br><a href='logout'>Logout</a>");
			}
		}else {
			out.print("kindly login is first");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}
	
	

}
