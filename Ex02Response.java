package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Response")
public class Ex02Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response(응답객체) : 사용자에게 요청결과를 보내줄 때 사용하는 객체
		// 응답데이터 : html와 같은 문서, 이미지, 파일 형태 등
		// 페이지이동(redirect)

		// 응답데이터의 포맷을 설정하는 메소드
		//MIME Type : 데이터 포맷 설정(타입/서브타입 으로 구성)(ex "text(타입)/html(서브타입);) 
		//인코딩 : 컴퓨터가 해석할 수 있도록 데이터의 형식을 지정하는 것(EUC-KR, UTF-8(주로 많이 사용함) 등등)
		//인코딩은 텍스트형태의 데이터를 보낼때 설정하는것! 다른 타입은 인코딩 안적어도 된다.
		response.setContentType("text/html; charset=utf-8"); //사용자에게 어떠한 문서를 전달해줄지 타입을 설정하는것

		// 사용자에게 데이터를 전달하기 위한 객체생성
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head><title>Response객체</title></head>"); //주소창 위에 나오는 이름
		out.print("<body>");
		out.print("<h1>Hello 해 햬<h1>");
		out.print("</body>");
		out.print("<html>");
		out.print("후원!");

	}

}
