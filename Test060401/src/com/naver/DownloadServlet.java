package com.naver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fileName = request.getParameter("fileName");
		String uploadPath = "C:" + File.separator + "upload";
//		String uploadPath = request.getServletContext().getRealPath("img"); // 원래 이렇게 해야함
		
		// 다운로드를 위한 환경 설정
		String filePath = uploadPath + File.separator + fileName;
		File f = new File(filePath);
		
		InputStream in = null;
		
		try {
			in = new FileInputStream(f);
			
			String sMimeType = getServletContext().getMimeType(filePath);
			
			if(sMimeType == null) {
				sMimeType = "application/octet-stream";
			} 
			
			response.setContentType("sMimeType");
			
			String encoding = new String(fileName.getBytes("utf-8"), "8859_1");
			
			response.setHeader("Content-Disposition", "attachment;filename=" + encoding);
			
			ServletOutputStream out = response.getOutputStream(); //fileoutputStream이라고 생각하셈 
			
			byte[] arr = new byte[1024];
			
			int leng = -1;
			
			while (true) {
				leng = in.read(arr, 0, arr.length);
				if (leng == -1) {
					break;
				}
				
				out.write(arr, 0, leng);
			}
			
			out.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
