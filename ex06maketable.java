package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maketable")
public class ex06maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String room = request.getParameter("room");
		int room1 = Integer.parseInt(room);
		
		out.print("<html><head><title>°á°ú</title></head>");
		out.print("<body>");
		out.print("<table border=1px solid black>");
		out.print("<tr>");
		for(int i = 1; i <= room1; i++) {
			out.print("<td>" + i + "</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("</body></html>");
		
		
		
		
	}

}
