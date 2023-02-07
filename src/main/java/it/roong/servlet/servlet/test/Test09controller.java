package it.roong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String application = request.getParameter("application");
		
		out.println("<html><head><title>입사지원</title></head> <body>");
		out.println("<h2>" + name + "님 지원이 완료되었습니다.</h2> <hr>");
		out.println("지원내용 <br>");
		out.println(application);
		out.println("</body></html>");
		
		
		
		
		
	}
}
