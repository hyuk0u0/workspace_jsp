package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =  request.getSession(false);
		
		if(session != null) {
//			session.setMaxInactiveInterval(1);
//			session.removeAttribute("login");
			session.invalidate();
		} 
//			response.sendRedirect("select.do");
			return new CommandAction(true, "select.do");
		
		
	}

}
