package it.roong.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter(); //throw~ 오류뜨면 이거 선택
		out.println("Hello World!!!");
	}
	
	
}
