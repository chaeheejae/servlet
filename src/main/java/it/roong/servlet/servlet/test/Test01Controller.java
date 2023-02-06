package it.roong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//캐릭터 셋
		response.setCharacterEncoding("utf-8");
		
		//데이터 타입
		response.setContentType("text/plain");
		
		//날짜 표현하기
		Date now = new Date();
		SimpleDateFormat todayDate = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 d일");
		String dateTimeStirng = todayDate.format(now);
		
		//데이터 채우기
		PrintWriter out = response.getWriter();
		out.println(dateTimeStirng);
	}
	
	
}
