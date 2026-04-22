package com.winter.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class MapMain1 {
	
	public static void main(String[] args) {
		//  generic 
		HashMap<String, V> map = new HashMap<>();
		map.put("a1",5);
		map.put("a2",7);
		
		System.out.println(map.get("a2"));
		System.out.println(map.size());
		
		//반복문 사용
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			System.out.println("Key :  "+k");"
			System.out.println(map.get(k));
		}
		
		}
	//학생의 이름을 입력해서 일치하는 학생의 정보를 삭제
	//delete
	public void delete (ArrayLost<StudntDTO> ar) {
		System.out.println("학생의 이름 입력")
		String name = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i)getName()) {
				ar.remove(i);
				return true;
			}
		}
		
		 //return false;
		
		
	}

}
