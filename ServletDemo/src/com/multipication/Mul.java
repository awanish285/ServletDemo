package com.multipication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mul extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		int l=Integer.parseInt(req.getParameter("m1"));
		int t=Integer.parseInt(req.getParameter("m2"));
		
		int z=l*t;
		
		PrintWriter out=res.getWriter();
		
		out.println("Multiplication of two number is : "+ z);
	}

}
