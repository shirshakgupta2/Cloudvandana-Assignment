package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/callAssign2")
public class Assignment2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sentence = req.getParameter("sentence");
		String letter = req.getParameter("letter");
		if(sentence.contains(letter)) {
			PrintWriter out = resp.getWriter();
			out.print(sentence.substring(sentence.indexOf(letter)+1));
		}
		else {
			PrintWriter out = resp.getWriter();
			out.print("The letter does not exist in the sentence");
		
		}
	}
}
//<servlet>
//<servlet-name>callAssign2</servlet-name>
//<servlet-class>com.tap.Assignment2</servlet-class>
//</servlet>
//<servlet-mapping>
//   <servlet-name>callAssign2</servlet-name>
//   <url-pattern>/callAssign2</url-pattern>
//</servlet-mapping>