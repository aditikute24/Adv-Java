package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("GenericServlet is Triggered");

		PrintWriter pw = res.getWriter();

		pw.print(
		    "<!DOCTYPE html>"
		    + "<html>"
		    + "<head>"
		    + "<title>Generic Servlet</title>"
		    + "<style>"
		    + "body{"
		    + "margin:0;"
		    + "display:flex;"
		    + "justify-content:center;"
		    + "align-items:center;"
		    + "height:100vh;"
		    + "background:linear-gradient(135deg,#6dd5ed,#2193b0);"
		    + "font-family:Arial,sans-serif;"
		    + "}"
		    + ".container{"
		    + "background:white;"
		    + "padding:40px;"
		    + "border-radius:15px;"
		    + "box-shadow:0 8px 20px rgba(0,0,0,0.3);"
		    + "text-align:center;"
		    + "}"
		    + "h1{"
		    + "color:#2193b0;"
		    + "margin:0;"
		    + "font-size:36px;"
		    + "}"
		    + "p{"
		    + "color:#555;"
		    + "font-size:18px;"
		    + "margin-top:15px;"
		    + "}"
		    + "</style>"
		    + "</head>"
		    + "<body>"
		    + "<div class='container'>"
		    + "<h1>Welcome to GenericServlet Class</h1>"
		    + "<p>Your servlet is running successfully! 🎉</p>"
		    + "</div>"
		    + "</body>"
		    + "</html>"
		);
		
	}

}
