package com.naver;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dao.MemberDAO;
import kr.co.domain.MemberDTO;

public class SelectByIdCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1, 클라이언트가 보내준 데이터 획득/가공
		String id = request.getParameter("id");
		//2. DAO 객체 만들고 해당 메서드 호출
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		//3. 데이터 바인딩
		request.setAttribute("dto", dto);
		//4. 포워딩
//		request.getRequestDispatcher("selectById.jsp").forward(request, response);
		return new CommandAction(false, "selectById.jsp");
	}

}
