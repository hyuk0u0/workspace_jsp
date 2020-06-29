package kr.co.ca;

import java.io.File;

public class MainEx {
	public static void main(String[] args) {
		// 폴더 생성 / 삭제
		File f1 = new File("c:" + File.separator + "AAA");
		
		if(!f1.exists()) {
			System.out.println("AAA폴더가 없습니다.");
			f1.mkdir();
			System.out.println("AAA폴더를 생성합니다.");
		} else {
			System.out.println("AAA폴더가 있습니다.");
			f1.delete();
			System.out.println("AAA폴더를 삭제합니다.");
		}
		
		//파일 삭제
		File f2 = new File("C:" + File.separator + "test1.txt");
				
		boolean isDel = f2.delete();
		
		if(isDel) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
		//파일 이름 변경
		File f3 = new File("c:", "test2.txt");
		File newName = new File("c:" + File.separator + "newnew.txt");
		
		boolean isRename = f3.renameTo(newName);
		
		if (isRename) {
			System.out.println("이름 변경 성공!");
		} else {
			System.out.println("이름 변경 실패!");
		}
		
		File f4 = new File("c:", "BBB");
		
		if(!f4.exists()) {
			System.out.println("BBB폴더를 생성합니다.");
			f4.mkdir();
		}
		
		//파일 이동
		File f5 = new File("c:", "ing.txt");
		File f6 = new File(f4, "ang.txt");
		
		f5.renameTo(f6);
		
	}
}
