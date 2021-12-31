package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class Ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// post방식일 때 한글 깨짐 방지를 위한 메소드
		//데이터를 request 객체로부터 가져오기 전에 설정한다.
		req.setCharacterEncoding("utf-8");

		System.out.println("요청이 들어옴!");
		// 사용자가 입력한 id와 pw를 변수에 저장한 후 콘솔창에 출력해보기

		String id = req.getParameter("user-id");
		String pw = req.getParameter("user-pw");
		resp.setContentType("text/html; charset = utf-8");
		PrintWriter out = resp.getWriter();
		System.out.println(id + " / " + pw);

		out.print("<html><head><title>로그인</title></head>");
		out.print("<body>");
		out.print("</body></html>");

	}

//	//get방식일 때 호출되는 메소드
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("get방식으로 실행!");
//	}
//	//post방식일 때 호출되는 메소드
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("post방식으로 실행!");
//	}
//
}
