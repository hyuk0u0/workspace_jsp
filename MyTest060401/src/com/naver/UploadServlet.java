package com.naver;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/update")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		File uploadFolder = new File("C:" + File.separator + "upload");
		
		if (!uploadFolder.exists()) {
			uploadFolder.mkdir();
		}
		
		String title = "";
		String fileName = "";
		String orgFileName = "";
		
		MultipartRequest multi = new MultipartRequest(request, "C:" + File.separator + "upload", 10*1024*1024, "utf-8", new DefaultFileRenamePolicy());
		
		title = multi.getParameter("title");
		fileName = multi.getParameter("file");
		orgFileName = multi.getOriginalFileName("file");
		
		request.setAttribute("fileName", fileName);
		request.setAttribute("orgFileName", orgFileName);
		
		request.getRequestDispatcher("check.jsp").forward(request, response);
		
		
	}

}
