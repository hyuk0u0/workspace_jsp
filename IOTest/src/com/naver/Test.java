package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public void me1() {
		File f1 = new File("C:" + File.separator + "workspace_jsp.zip");
		File f2 = new File("C:", "copyjsp.zip");

		InputStream in = null;
		OutputStream out = null;
		int what = -1;

		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);

			while (true) {
				what = in.read();
				if (what == -1) {
					break;
				}
				out.write(what);
			}
			System.out.println("파일 복사종료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me2() {
		File f1 = new File("c:", "workspace_jsp.zip");
		File f2 = new File("c:", "copyfile.zip");

		InputStream in = null;
		OutputStream out = null;

		byte[] arr = new byte[512];

		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);

			while (true) {
				int leng = in.read(arr);
				if (leng == -1) {
					break;
				}
				out.write(arr, 0, leng);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me3() {
		File f1 = new File("c:" + File.separator + "show.jpeg");
		File f2 = new File("c:", "copyshow.jpeg");
		
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream(f1);
			bis = new BufferedInputStream(in);
			
			out = new FileOutputStream(f2);
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			while (true) {
				what = bis.read();
				if (what == -1) {
					break;
				}
				bos.write(what);
			}
			System.out.println("파일 복사 종료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (in != null) {
					in.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me4() {
		File f1 = new File("c:", "test112.txt");
		File f2 = new File("c:", "copytest112.txt");
		
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream(f1);
			bis = new BufferedInputStream(in);
			
			out = new FileOutputStream(f2);
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			
			while (true) {
				what = bis.read();
				if (what == -1) {
					break;
				}
				bos.write(what);
			}
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (in != null) {
					in.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
