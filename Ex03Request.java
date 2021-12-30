package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL Mapping : 문자열로 Servlet 파일을 연결하는 기술
//Servlet 파일의 이름과 동일하지 않아도 연결가능
// 주의 사항! : '/'가 반드시 앞에 작성되어 있어야 한다.

@WebServlet("/Request") //-> 접근 경로이다.(URLMapping)
//404오류는 접근경로가 제대로 되지 않아서 생기는 오류이다
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//url pattern
		//         host         /contextPath/servletPath?queeryString
		//http://localhost:8081/Servlet/Ex03Request?name123
		
		//URL Mapping : 문자열로 servlet을 가리키도록 하는 기술(위에 문장의 /Ex03Request 부분이다)
		//->> /Ex03Request을 /Request로 바꿀 수 있다. ->>> 주소창에서 바뀐부분을 바꿔주면 접속 가능!!
		//Url Mapping의 장점 :
		
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
