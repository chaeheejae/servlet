package it.roong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10Controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		out.println("<html><head><title>로그인</title></head> <body>");

		if(!userMap.get("id").equals(id)) {
			out.println("id를 확인하세요.");
		} else if(!userMap.get("password").equals(password)) {
			out.println("password를 확인하세요.");
		} else {
			out.println("<h1>" + userMap.get("name") + "님 환영합니다.<h1>");
		}
	
		out.println("</body></html>");
	}
	
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "gmlwo");
	        put("password", "1234");
	        put("name", "채희재");
	    }
	};
}
