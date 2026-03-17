package kosmo163_java.lang;

public class StringEx2Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.nextLine();
		
		//파일명 -> 이름.확정자
		//이미지파일인지 체크, jpg, png, gif, jpeg
		//find.abc.png, test.pdf, hello.PNG 
		//이미지파일입니다. 이미지파일이 아닙니다.
		
		//1. .의 index
		int idx = fileName.indexOf(".");
		System.out.println(idx);
		//2. .이후의 문자열 꺼내오기
		String name = fileName.substring(idx+1);
		System.out.println(name);
		//3. 이미지 파일 체크
		if(name.equalsIgnoreCase("png")) {
			 System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("gif")) {
			 System.out.println("이미지다");
			 
		}else {
			System.out.println("이미지가 아니다");
		}
		
		//----------------------------
		String[] files = {"jpg", "png", "gif", "jpeg", "jiff"};
		
		String result = "이미지가 파일이 아니다";
		for(int i = 0; i < files.length; i++) {
			if(name.equalsIgnoreCase(files[i])) {
				result = "이미지 파일 입니다";
				break;
			}
		}
	
		System.out.println(count);//human
		
		String st  "한화, 기아, 삼성, 롯데, 키움, 두산, lg,nc, kt";
		
		String [] temas =st.split(",");
		
		for(int i = 0; i < temas.length; i++) {
			System.out.println(temas[i]);
		}
		
		System.out.println(temas[1].trim()  .equals(" 기아 "));
		
	}
}
