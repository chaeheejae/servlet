package it.roong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class Test08Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남?�� 최고 맛집 ?���? ?��?��?��.", 
		        "?��?�� 기분 좋�? ?��?�� ?��?��?��?��.", 
		        "?��?�� 맛집 ?��?��?���? ?��?�� 좋네?��.", 
		        "집에 �??�� 길에 ?��?�� 맛집 �??�� ?���? ?��갑니?��.",
		        "?���? ?? ?��?�� ?��?�� ?��?��?��."));
		
		out.println("<html><head><title>�??��결과</title></head> <body>");
		
		for(String result : list) {
			if(result.contains(keyword)) {
				result.replace(keyword, "<b>" + keyword + "</b>"); //?��?��?���? 볼드체로 만들?��?�� �??��?�� ???��?��?��. 그리�? ?��?��?���?
				out.println(result + "<hr>");
			}
		}
		
		out.println("</body></html>");
		
		
		
		
	}
}
