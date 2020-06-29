package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		int age = 0;
		if (sAge != null) {
			age = Integer.parseInt(sAge);
		}
		String pw = request.getParameter("pw");
		
		// 익명 객체로 메소드 호출해버리기
		new MemberDAO().update(new MemberDTO(id, name, age, pw));
		
		return new CommandAction(true, "selectById.bo?id=" + id);
	}

}
