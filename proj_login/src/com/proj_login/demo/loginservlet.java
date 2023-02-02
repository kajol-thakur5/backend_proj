package com.proj_login.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String token = req.getParameter("email");
        PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		
		session.setAttribute("key", token);
		if(token!=null) {
		 out.print("<form action='dashboard' method='get'>");
		 out.print("Welcome user :"+token);
		 out.print("<br><a href='logout'>logout</a>");
		 out.print("</form>");
		}
		else
		{out.print("kindly login is first");}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
