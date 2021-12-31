package com.smhrd.servlet1231;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex08UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
//	String food = request.getParameter("food");
	// -> 이렇게 하면 여러개 체크해도 제일 위에꺼만 나온다!
	
	//교재 참고!
	//p81 서블릿 동작원리 & 라이프 싸이클
	//p76,86 요청 메소드(doGet & doPost)
	//p108 request.setCharacterEncoding()
	//p116 getParamaterValues()
	
	//checkbox타입의 값에 접근할 때 아래 메소드를 활용!
	//또는! name 속성값이 동일한 여러개의 입력값을 접근할 때도 아래 메소드 활용!
	// 문자열 배열로 반환한다!
	String[] foods = request.getParameterValues("food");
	System.out.println(Arrays.toString(foods));
	
	
	
	}

}
