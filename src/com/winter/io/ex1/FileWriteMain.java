package com.winter.io.ex1;

import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

public static void main(String[] args) {
	// 키보드로 부터 입력받은 메세지를 
	// sub2//msg.txt 파일에 저장
	// 입력시 exit를 입력하면 쓰지않고 프로그램이 종료
	Scanner sc = new Scanner(System.in);
	while(check)  {
	System.out.println("입력");
	String s = sc.next();
		
	if(s.equalsIgnoreCase("EXIT"))  {
		break;
	
	}
			
	File file = new File("C:\\yubin\\sub1\\msg.txt")
			booolean check = ture;
			
			try {
				fileWriter fw =  new fileWriter(file, true);
				fw.write(s+"n");
				fw.flush();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

}
