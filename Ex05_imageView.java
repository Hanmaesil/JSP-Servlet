package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/image")
public class Ex05_imageView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num"));
		String src = "";
		
		if(num == 1) {
			src = "img/cat1.jpg";
		}else if(num == 2) {
			src = "img/cat2.jpg";
		}else if(num == 3) {
			src = "img/cat3.jpg";
		}
		out.print("<html><head><title>고냥이 최고!!</title></head>");
		out.print("<body>");
		out.print("<img src = '" +src+ "'alt = '해당 이미지를 불러올 수 없습니다.'>");
		out.print("</body></html>");
		
	}

}
