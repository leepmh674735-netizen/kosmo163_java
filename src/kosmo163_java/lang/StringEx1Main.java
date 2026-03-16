package kosmo163_java.lang;

public class StringEx1Main {

	public static void main(String[] args) {
		String str = "Hello World";
		
		int 1 = str.length();
		
		System.out.println(1);
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		
		String s= String.valueOf(false);
		System.out.println(s);
		name2 = "winter";
		c=name.equals(name2);
		System.out.println(c);
		c=name.equalsIgnoreCase(name2);
		System.out.println(c);
		
		
	}
}
