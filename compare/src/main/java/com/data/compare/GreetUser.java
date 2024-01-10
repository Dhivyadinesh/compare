package com.data.compare;

import java.io.IOException;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class GreetUser extends HttpServlet {
	
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		res.setContentType("text/html");
		res.getWriter().print("dd");
		
	}

}
