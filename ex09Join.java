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
//		response.setCharacterEncoding("utf-8"); �����ϰ� ���ڵ��� �ҰŸ� �̰͵� ��밡���ϴ�!
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		//request.getParameterValues -> ������ �̸��� �� ����Ѵ�.
		String brith = request.getParameter("brith"); //dataŸ���ε� �̷��� �ص� �߳���
		String color = request.getParameter("color");
		String[] country = request.getParameterValues("country");
		String talk = request.getParameter("talk");
		
		
		
		
		System.out.println("�Է��� id >> " + id);
		System.out.println("�Է��� pw >> " + pw);
		System.out.println("�Է��� �̸� >>" +name);
		System.out.println("�Է��� �̸��� >> " + email);
		System.out.println("�Է��� ��ȭ��ȣ >> " + tel);
		System.out.println("üũ�� ���� >> " +gender);
		System.out.println("üũ�� ��� >> " + Arrays.toString(hobby));
		System.out.println("������� : " + brith);
		System.out.println("�����ϴ� �� >> " + color);
		System.out.println("������ ���� >> " + Arrays.toString(country));
		System.out.println("TALK! >> " + talk);
		
		out.print("<html><head><style>");
		out.print("div p { font-style : italic}");
		out.print("</style>");
		out.print("<title>�Է°��</title></head>");
		out.print("<body><div>");
		out.println("<p>�Է��� id >> " + id + "</p>");
		out.println("<p>�Է��� pw >> " + pw+ "</p><br>");
		out.println("<p>�Է��� �̸� >>" +name+ "</p><br>");
		out.println("<p>�Է��� �̸��� >> " + email+ "</p><br>");
		out.println("<p>�Է��� ��ȭ��ȣ >> " + tel+ "</p><br>");
		out.println("<p>üũ�� ���� >> " +gender+ "</p><br>");
		out.println("<p>üũ�� ��� >> " + Arrays.toString(hobby)+ "</p><br>");
		out.println("<p>������� : " + brith+ "</p><br>");
		out.println("<p>�����ϴ� �� >> " + color+ "</p><br>");
		out.println("<p>������ ���� >> " + Arrays.toString(country)+ "</p><br>");
		System.out.println("<p>TALK! >> " + talk+ "</p><br>");
		
		out.print("</div></body></html>");
		
		
		
	}

}
