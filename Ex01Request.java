package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request(요청객체) : 사용자가 요청을 했을 때 사용자의 정보를 저장하는 객체
		//정보 : ip, 브라우저 정보(버전, 언어, 인코딩 방식 등등...), 사용자가 입력한 정보들
		//ip를 알아와서 출력하기
		String ip = request.getRemoteAddr();
		System.out.println("접속한 ip >>" + ip);
		//ip를 확인하여 다른 출력문이 나오도록 구현하시오
		//팀원 접속시 : oo님 환영합니다.
		//강사 접속시 : 강사님 환영합니다.
		//이외 접속시 : 손님 환영합니다.
		
		if(ip.equals("59.0.124.155")) {
			System.out.println("종인아 왔니?");
		}else if(ip.equals("211.63.240.114")){
			System.out.println("건하야 왔니?");
		}else if(ip.equals("59.0.124.191")) {
			System.out.println("희태야 왔니?");
		}else if(ip.equals("59.0.236.270")) {
			System.out.println("강사님 환영합니다");
		}else {
			System.out.println("손님 환영합니다");
		}
		
		
	}

}
