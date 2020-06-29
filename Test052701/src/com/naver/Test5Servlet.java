package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test5Servlet
 */
@WebServlet("*.do")
public class Test5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post한글을 위한 코드 get 한글을 위한 코드는 severs.xml에 입력되어있음.
		response.setContentType("text/html;charset = utf-8");
		
		String uri = request.getRequestURI();
		String ctxp = request.getContextPath();
		System.out.println(uri);
		System.out.println(ctxp);
		String sp = uri.substring(ctxp.length());
		
		if(sp.equalsIgnoreCase("/insert.do")) { // 대소문자 무시하고 문자열이 같은지 확인 
			System.out.println("입력입니다.");
		} else if(sp.equalsIgnoreCase("/select.do")) {
			System.out.println("조회입니다.");
		} else if(sp.equalsIgnoreCase("/update.do")) {
			System.out.println("수정입니다.");
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
