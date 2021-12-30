package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL Mapping : ���ڿ��� Servlet ������ �����ϴ� ���
//Servlet ������ �̸��� �������� �ʾƵ� ���ᰡ��
// ���� ����! : '/'�� �ݵ�� �տ� �ۼ��Ǿ� �־�� �Ѵ�.

@WebServlet("/Request") //-> ���� ����̴�.(URLMapping)
//404������ ���ٰ�ΰ� ����� ���� �ʾƼ� ����� �����̴�
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//url pattern
		//         host         /contextPath/servletPath?queeryString
		//http://localhost:8081/Servlet/Ex03Request?name123
		
		//URL Mapping : ���ڿ��� servlet�� ����Ű���� �ϴ� ���(���� ������ /Ex03Request �κ��̴�)
		//->> /Ex03Request�� /Request�� �ٲ� �� �ִ�. ->>> �ּ�â���� �ٲ�κ��� �ٲ��ָ� ���� ����!!
		//Url Mapping�� ���� :
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String ip = request.getRemoteAddr();
		
		out.print("<html>");
		out.print("<head><title>Request&Response �ǽ�</title></head>");
		out.print("<body>");
		if (ip.equals("59.0.124.155")) {
			out.println("<h1>���ξ� �Դ�?</h1>");
		} else if (ip.equals("211.63.240.114")) {
			out.println("<h1>���Ͼ� �Դ�?</h1>");
		} else if (ip.equals("59.0.124.191")) {
			out.println("<h1>���¾� �Դ�?</h1>");
		} else if (ip.equals("59.0.236.270")) {
			out.println("<h1>����� ȯ���մϴ�</h1>");
		} else {
			out.println("<h1>�մ� ȯ���մϴ�</h1>");
		}out.print("</body></html>");
		
		
	}

}
