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
		//505 ����! : servlet �����̴�!
		//404 ����! : ������� �����̴�!
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		//��Ʈ�������� ���� �޾ƿ���
//		String data1 = request.getParameter("int1");
//		String data2 = request.getParameter("int2");
		//���������� ����ȯ(Integer.parseInt() �Ǵ� Integer.valueOf() ��� ->>�޼ҵ���!)
//		int result = Integer.parseInt(data1) + Integer.valueOf(data2); 
//		int num = Integer.parseInt(request.getParameter("int1")); �̷��ĵ� ����!
		
		//Ʈ���� ĳġ�� �Է�ĭ �����̳� ���ڿ��� ���ͼ� ����� ������ ���� �� �ִ�!
		
		try {
			String data1 = request.getParameter("int1");
			String data2 = request.getParameter("int2");
			int result = Integer.parseInt(data1) + Integer.valueOf(data2);
			out.print(data1 + " + " + data2 + " = " + result);
		}catch (NumberFormatException e) {
			out.print("�ٽ���������");
		}
		
		
		
		
		//text���� ���
		
//		out.print(data1 + " + " + data2 + " = " + result);
//		
//		//html ���� ���
//		
//		out.print("<html><head><title>������</title></head>");
//		out.print("<body>");
//		out.print("<h1>�� ���� ���ϱ� ���� ��� : </h1>");
//		out.print("<h2>" +data1 + " + " + data2 + " = " + result + "</h2>");
//		out.print("</body></html>");
		
		
		
		
		
		
	}
	

}
