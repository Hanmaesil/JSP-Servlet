package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class ex09Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
//		response.setCharacterEncoding("utf-8"); 순수하게 인코딩만 할거면 이것도 사용가능하다!
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		//request.getParameterValues -> 동일한 이름일 때 사용한다.
		String brith = request.getParameter("brith"); //data타입인데 이렇게 해도 잘나옴
		String color = request.getParameter("color");
		String[] country = request.getParameterValues("country");
		String talk = request.getParameter("talk");
		
		
		
		
		System.out.println("입력한 id >> " + id);
		System.out.println("입력한 pw >> " + pw);
		System.out.println("입력한 이름 >>" +name);
		System.out.println("입력한 이메일 >> " + email);
		System.out.println("입력한 전화번호 >> " + tel);
		System.out.println("체크한 성별 >> " +gender);
		System.out.println("체크한 취미 >> " + Arrays.toString(hobby));
		System.out.println("생년월일 : " + brith);
		System.out.println("좋아하는 색 >> " + color);
		System.out.println("선택한 나라 >> " + Arrays.toString(country));
		System.out.println("TALK! >> " + talk);
		
		out.print("<html><head><style>");
		out.print("div p { font-style : italic}");
		out.print("</style>");
		out.print("<title>입력결과</title></head>");
		out.print("<body><div>");
		out.println("<p>입력한 id >> " + id + "</p>");
		out.println("<p>입력한 pw >> " + pw+ "</p><br>");
		out.println("<p>입력한 이름 >>" +name+ "</p><br>");
		out.println("<p>입력한 이메일 >> " + email+ "</p><br>");
		out.println("<p>입력한 전화번호 >> " + tel+ "</p><br>");
		out.println("<p>체크한 성별 >> " +gender+ "</p><br>");
		out.println("<p>체크한 취미 >> " + Arrays.toString(hobby)+ "</p><br>");
		out.println("<p>생년월일 : " + brith+ "</p><br>");
		out.println("<p>좋아하는 색 >> " + color+ "</p><br>");
		out.println("<p>선택한 나라 >> " + Arrays.toString(country)+ "</p><br>");
		System.out.println("<p>TALK! >> " + talk+ "</p><br>");
		
		out.print("</div></body></html>");
		
		
		
	}

}
