package com.winter.io.ex1;

import java.io.FileReader;

public class FileReadMain {
	
	public static void main(String[] args) {
		File file =  new File("C:\\yubin\\sub1\\msg.txt");
	    FileReader fr = new FileReader(file);
	    try {
			FileREader fr + new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while(true)  {
			String s = br.readLine();
			if(s==null)
				break;
			}
			System.out.println(s);		
	    }		
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
	}

}
