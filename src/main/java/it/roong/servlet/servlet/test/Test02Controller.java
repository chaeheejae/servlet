package it.roong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//데이터 셋
		response.setCharacterEncoding("utf-8");
		//데이터 값
		response.setContentType("text/plain");
		//지금 시간
		
		Date now = new Date();
		SimpleDateFormat printTime = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		String timeStirng = printTime.format(now);
		
		//데이터 채우기
		PrintWriter out = response.getWriter();
		out.println(timeStirng);
	}
	
	
}
