package com.winter.exception1;

public class ExceptionEx {

	
         public void ex2() {
        	 String s="";
        	 String s2 = "def";
        	 String s3 = s+s2;
        	 if(s3.isEmpty())  {
        		 throw new Exception();
        	 }
        	 System.out.println(s3);
	}

}
