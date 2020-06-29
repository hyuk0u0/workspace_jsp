package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.dao.MemberDAO;
import kr.co.domain.LoginDTO;

public class LoginCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDAO dao = new MemberDAO();
		boolean login = dao.login(new LoginDTO(id, pw));
		
		//request.getSession(true); // 있으면 주고 없으면 만들어서줘
		//request.getSession(false); // 있으면 주고 없으면 주지마
		
		if(login) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60);
			session.setAttribute("login", new LoginDTO(id, null));
//			response.sendRedirect("select.do");
			return new CommandAction(true, "select.do");
		} else {
//			response.sendRedirect("loginui.do");
			return new CommandAction(true, "loginui.do");
		}
		
	}

}
