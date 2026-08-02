package com.tyss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Page-A is triggered");

		resp.getWriter().print("<html><body><h1>Welcome to Servlet Page-A</h1></body></html>");

		String personName = "Penga";
		int personAge = 25;

		Student student = new Student("Mangi", "mangi@gmail.com", 456789);

		req.setAttribute("pname", personName);
		req.setAttribute("page", personAge);
		req.setAttribute("stud", student);

		System.out.println("data set to the req");

		RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
		rd.forward(req, resp);
//		rd.include(req, resp);
	}

}