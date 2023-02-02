package com.genericservex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class testservlet implements Servlet{

	private ServletConfig config= null;
	@Override
	public void destroy() {
		config = null;
		System.out.println("Destroy called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println(" "+config);
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println(" "+config.getServletName());
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("init called");
		this.config = config; 
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("service called");
		PrintWriter out = resp.getWriter();
		out.print("this is my servlet");
		
	}

}
