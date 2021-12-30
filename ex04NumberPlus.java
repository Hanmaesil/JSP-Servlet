package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberPlus")
public class ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//505 에러! : servlet 문제이다!
		//404 에러! : 지정경로 문제이다!
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		//스트링형태의 숫자 받아오기
//		String data1 = request.getParameter("int1");
//		String data2 = request.getParameter("int2");
		//정수형으로 형변환(Integer.parseInt() 또는 Integer.valueOf() 사용 ->>메소드임!)
//		int result = Integer.parseInt(data1) + Integer.valueOf(data2); 
//		int num = Integer.parseInt(request.getParameter("int1")); 이런식도 가능!
		
		//트라이 캐치로 입력칸 공백이나 문자열이 들어와서 생기는 오류를 잡을 수 있다!
		
		try {
			String data1 = request.getParameter("int1");
			String data2 = request.getParameter("int2");
			int result = Integer.parseInt(data1) + Integer.valueOf(data2);
			out.print(data1 + " + " + data2 + " = " + result);
		}catch (NumberFormatException e) {
			out.print("다시적으세요");
		}
		
		
		
		
		//text형태 출력
		
//		out.print(data1 + " + " + data2 + " = " + result);
//		
//		//html 형태 출력
//		
//		out.print("<html><head><title>응답결과</title></head>");
//		out.print("<body>");
//		out.print("<h1>두 수의 더하기 연산 결과 : </h1>");
//		out.print("<h2>" +data1 + " + " + data2 + " = " + result + "</h2>");
//		out.print("</body></html>");
		
		
		
		
		
		
	}
	

}
