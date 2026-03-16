package kosmo163_java.lang;

public class StringMain2 {

	public static void main(String[] args) {
		String str1 = "Hello World";
		char ch = str1.charAt(0);
		
		int idx =str.indexOf("1");
		System.out.println(idx);
		
		idx = str.lastIndexOf("1");
		System.out.println(idx);
		
		//1이 총 몇 개인지 구하자
		int count = 0;
		boolean flag = true;
		int index = -1;
		//Hello world  
		while(flag) {
          index = str.indexOf("1", index+1);
           if(index != -1) {
			   count++;
           }else {
        	       flag = false;
        	       break;
           }
		}
		
		System.out.println(count)//human 
}