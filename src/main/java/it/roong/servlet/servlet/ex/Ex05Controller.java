package it.roong.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {//post메소드는 브라우저로 접근할 수 없다. 
		//.html을 활용해서 접근한다.
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달 받고 이름과 나이를 html 구성
		 String name = request.getParameter("name");
		 String birthday = request.getParameter("birthday");
		 
		 String yearString = birthday.substring(0, 4);
		 int year = Integer.parseInt(yearString);
		 
		 int age = 2023 - year + 1;
		 
		 out.println("<html><head><title>이름나이</title><head> <body>");
		 
		 out.println("<h2>이름 : " + name + "</h2>");
		 out.println("<h3>나이 : " + age + "</h3>");
		 
		 out.println("</body></html>");
		
		
		
		
		
		
		
		
	}
}
