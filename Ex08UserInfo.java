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
	// -> �̷��� �ϸ� ������ üũ�ص� ���� �������� ���´�!
	
	//���� ����!
	//p81 ���� ���ۿ��� & ������ ����Ŭ
	//p76,86 ��û �޼ҵ�(doGet & doPost)
	//p108 request.setCharacterEncoding()
	//p116 getParamaterValues()
	
	//checkboxŸ���� ���� ������ �� �Ʒ� �޼ҵ带 Ȱ��!
	//�Ǵ�! name �Ӽ����� ������ �������� �Է°��� ������ ���� �Ʒ� �޼ҵ� Ȱ��!
	// ���ڿ� �迭�� ��ȯ�Ѵ�!
	String[] foods = request.getParameterValues("food");
	System.out.println(Arrays.toString(foods));
	
	
	
	}

}
