package com.winter.util.ex1;

public class StudentService {

	private String data;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}

   public void init( ) {
	   //data를 파싱 작업
	   
	   System.out.println("===========================");
	   StringTokenizer st = new StringTokenizer(this.data, "-");
	   //StubentDTO [] ar = new StudentDTO();
	   
	   System.out.println(st.nextToken());
	   int index=0;   
	  while(st.hasMoreTokens()) {
		  
	  }
	   String s1 = st.nextToken();
	   String s2 = st.nextToken();
	   String s3 = st.nextToken();
	   String s4 = st.nextToken();
	   System.out.println(s1);
	   System.out.println(s2);
	   String s2 = st.nextInt
	   System.out.println(s3);
	   System.out.println(s4);
	   ar[index]=dto;
	   
	   System.out.println("==================");
	   
   }
   return ar;
}
