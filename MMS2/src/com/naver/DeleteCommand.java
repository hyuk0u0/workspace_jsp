package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.dao.MemberDAO;
import kr.co.domain.LoginDTO;

public class DeleteCommand implements Command{
	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
	
		HttpSession session = request.getSession(false);
		if (session != null) {
			LoginDTO loginDTO = (LoginDTO) session.getAttribute("login");
			if (loginDTO != null) {
				if (loginDTO.getId().equals(id)) {
					MemberDAO dao = new MemberDAO();
					dao.delete(id);
					session.invalidate();
//					response.sendRedirect("select.do");
					return new CommandAction(true, "select.do");
				}else {
//					response.sendRedirect("loginui.do");
					return new CommandAction(true, "loginui.do");
				}
			} else {
//				response.sendRedirect("loginui.do");
				return new CommandAction(true, "loginui.do");
			}
		} else {
//			response.sendRedirect("loginui.do");
			return new CommandAction(true, "loginui.do");
		}
		
		
		
	}
}
