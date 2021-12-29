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
		//request(��û��ü) : ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		//���� : ip, ������ ����(����, ���, ���ڵ� ��� ���...), ����ڰ� �Է��� ������
		//ip�� �˾ƿͼ� ����ϱ�
		String ip = request.getRemoteAddr();
		System.out.println("������ ip >>" + ip);
		//ip�� Ȯ���Ͽ� �ٸ� ��¹��� �������� �����Ͻÿ�
		//���� ���ӽ� : oo�� ȯ���մϴ�.
		//���� ���ӽ� : ����� ȯ���մϴ�.
		//�̿� ���ӽ� : �մ� ȯ���մϴ�.
		
		if(ip.equals("59.0.124.155")) {
			System.out.println("���ξ� �Դ�?");
		}else if(ip.equals("211.63.240.114")){
			System.out.println("���Ͼ� �Դ�?");
		}else if(ip.equals("59.0.124.191")) {
			System.out.println("���¾� �Դ�?");
		}else if(ip.equals("59.0.236.270")) {
			System.out.println("����� ȯ���մϴ�");
		}else {
			System.out.println("�մ� ȯ���մϴ�");
		}
		
		
	}

}
