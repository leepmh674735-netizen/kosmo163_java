package com.winter.io;

import java.io.BufferedReader;

public class IOMain1 {

	public static void main(String[] args) {
		//연결준비
		InputStream is=null;
		InputStreamReader ir = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(ir);
       
         System.out.println("입력");
         String str;
         try {
        	 str = br.readLine();
        	 System.out.println(str);
         } catch (IOException e)  {
        	 // TODO Auto-generated catch block
        	 e.printStackTrace();
         }
        
	}

}
