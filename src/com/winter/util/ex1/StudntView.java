package com.winter.util.ex1;

public class StudntView {
 
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0;i<ar, length;i++) {
			this.view(ar[i]);
		} 
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("이름 : "+studentDTO.getName());
		System.out.println("국어 : "+studentDTO.getName());
		System.out.println("영어 : "+studentDTO.getName());
		System.out.println("수학 : "+studentDTO.getName());
	}

}
