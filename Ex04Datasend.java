package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataSend") // ->UrlMapping으로 이름 바꾼것!
public class Ex04Datasend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		// 실행은 문서(html)에서 먼저 실행하는것!!
		System.out.println("서버의 요청이 들어옴.......!!!!!!!!!!");
		// 사용자가 입력한 데이터 가져오기!
		String data = request.getParameter("data");
		System.out.println("전달 받은 값 : " + data);
		
		out.print("<html><head><title>응답결과</title></head>");
		out.print("<body>서버에서 보낸 값 : "+ data + "</body></html>");
		
		if(data.equals("123")) {
			out.println("작동 완료!");
		}
		
	}

}
