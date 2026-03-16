package kosmo163_java.lang;

public class StringMain {

	public static void main(String[] args) {
		 
		String name="winter";
		 
		char ch = name.charAt(0); //문자열의 0번째 인덱스의 문자를 반환한다. 'w'가 반환된다.
		
		System.out.println(ch);   
		
		Object obj = new Object();
		String st = obj.toString(); 
		String st2 = name.toString();
		System.out.println(obj); 
		System.out.println(st);
		System.out.println(st2);
		System.out.println(name);
		
		String s3 = sc.nextLine();
		System.out.println(s3);
		
		Object obj2 = new object();
		boolean check = obj.equals(obj2);
		System.out.println(c);
		
		String s4 = "winter";
        c=name.equals(s4); //obj ==obj2;
        System.out.println(c);
        
        	}