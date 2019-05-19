package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);
		
		int c=a+b;
		System.out.println("result is :"+ c);
		
		PrintWriter out=res.getWriter();
		out.println("result is : "+ c);
		
		
	}

}
