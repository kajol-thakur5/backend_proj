package com.myfirstprac.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oneservlet")
public class firstservlet extends HttpServlet {

	public firstservlet() {
		super();
	}
	

	/*protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("hello world service method");
	}*/

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		String obj= req.getParameter("name");
		out.print("hello world get method");
		out.print("<br/> hello "+obj );
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("hello world post method");
		String obj= req.getParameter("name");
		out.print("<br/> hello "+obj );
	}

	
}
