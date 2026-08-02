package com.tyss;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Page-B is triggered");

		System.out.println("data recieved from the req");

		String name = (String) req.getAttribute("pname");
		int age = (int) req.getAttribute("page");
		Student s = (Student) req.getAttribute("stud");

		System.out.println(name);
		System.out.println(age);
		System.out.println(s);

		resp.getWriter().print(
				"<html>"
				+ "<body>"
				+ "<h1>Welcome," + name + " to Servlet Page-B</h1>"
				+ "<h2>Student Details</h2>"
				+  s
				+ "</body>"
				+ "</html>");
	}

}
