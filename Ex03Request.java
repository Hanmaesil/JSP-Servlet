package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String ip = request.getRemoteAddr();
		
		out.print("<html>");
		out.print("<head><title>Request&Response 실습</title></head>");
		out.print("<body>");
		if (ip.equals("59.0.124.155")) {
			out.println("<h1>종인아 왔니?</h1>");
		} else if (ip.equals("211.63.240.114")) {
			out.println("<h1>건하야 왔니?</h1>");
		} else if (ip.equals("59.0.124.191")) {
			out.println("<h1>희태야 왔니?</h1>");
		} else if (ip.equals("59.0.236.270")) {
			out.println("<h1>강사님 환영합니다</h1>");
		} else {
			out.println("<h1>손님 환영합니다</h1>");
		}out.print("</body></html>");
	}

}
