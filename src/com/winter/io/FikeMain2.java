package com.winter.io;

import java.io.File;
import java.io.FileWriter;

public class FikeMain2 {

	public static void main(String[] args) {
		String name="winter";
        File file = new File("C:\\yubin\\sub1\\info.txt");
		System.out.println(file.exists());
		
		FileWriter fw = new FileWriter(file);
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(name+"\n");
			fw.flush();//buffer를 강제비우기
		}catch (IOException)
		 //TODO Auti-generated catch block
		e.printStackTrace();
		}
		
	     System out println("종료")

		}

		}
	}

}
