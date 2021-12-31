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
		// post����� �� �ѱ� ���� ������ ���� �޼ҵ�
		//�����͸� request ��ü�κ��� �������� ���� �����Ѵ�.
		req.setCharacterEncoding("utf-8");

		System.out.println("��û�� ����!");
		// ����ڰ� �Է��� id�� pw�� ������ ������ �� �ܼ�â�� ����غ���

		String id = req.getParameter("user-id");
		String pw = req.getParameter("user-pw");
		resp.setContentType("text/html; charset = utf-8");
		PrintWriter out = resp.getWriter();
		System.out.println(id + " / " + pw);

		out.print("<html><head><title>�α���</title></head>");
		out.print("<body>");
		out.print("</body></html>");

	}

//	//get����� �� ȣ��Ǵ� �޼ҵ�
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("get������� ����!");
//	}
//	//post����� �� ȣ��Ǵ� �޼ҵ�
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("post������� ����!");
//	}
//
}
