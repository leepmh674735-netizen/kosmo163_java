package com.winter.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		File file = new File("C:\\yubin\\workspace\\study");
		
		boolean check = file.exists();
		check = file.isDirectory();
		System.out.println(check);
		
		file.mkdir();
		
		file = new File("C:\\Yubin\\workspace\\study")
		
		String [] list = file.list();
		
		 for(int i=0;i<list.lengh;i++) {
			System.out.println(list[i]);
			
			 
		     
		     file = new File("D:\\YU\\sub1\\sub2");
		     
		     file.mkdir();
		
	}
	
	
}
