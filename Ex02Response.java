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

		// response(���䰴ü) : ����ڿ��� ��û����� ������ �� ����ϴ� ��ü
		// ���䵥���� : html�� ���� ����, �̹���, ���� ���� ��
		// �������̵�(redirect)

		// ���䵥������ ������ �����ϴ� �޼ҵ�
		//MIME Type : ������ ���� ����(Ÿ��/����Ÿ�� ���� ����)(ex "text(Ÿ��)/html(����Ÿ��);) 
		//���ڵ� : ��ǻ�Ͱ� �ؼ��� �� �ֵ��� �������� ������ �����ϴ� ��(EUC-KR, UTF-8(�ַ� ���� �����) ���)
		//���ڵ��� �ؽ�Ʈ������ �����͸� ������ �����ϴ°�! �ٸ� Ÿ���� ���ڵ� ����� �ȴ�.
		response.setContentType("text/html; charset=utf-8"); //����ڿ��� ��� ������ ���������� Ÿ���� �����ϴ°�

		// ����ڿ��� �����͸� �����ϱ� ���� ��ü����
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head><title>Response��ü</title></head>"); //�ּ�â ���� ������ �̸�
		out.print("<body>");
		out.print("<h1>Hello �� ��<h1>");
		out.print("</body>");
		out.print("<html>");
		out.print("�Ŀ�!");

	}

}
