package com.sub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sub extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	
	{
		int i=Integer.parseInt(req.getParameter("t1"));
		int j=Integer.parseInt(req.getParameter("t2"));
		
		int k=i-j;
		
		PrintWriter out= res.getWriter();
		
		out.println("subtraction of two number is : "+ k);
		
		
		
		
		
	}

}
