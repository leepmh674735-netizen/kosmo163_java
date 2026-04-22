package com.winter.util.ex1;

import java.util.ArrayList;

public class StudentView {
    // 학생 1명 정보 출력
    public void print(StudentDTO dto) {
        int total = dto.getKor() + dto.getEng() + dto.getMath();
        double avg = total / 3.0;
        System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n",
                dto.getName(), dto.getKor(), dto.getEng(), dto.getMath(), total, avg);
    }

    // 학생 리스트 정보 출력
    public void print(ArrayList<StudentDTO> list) {
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        for (StudentDTO dto : list) {
            int total = dto.getKor() + dto.getEng() + dto.getMath();
            double avg = total / 3.0;
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
                    dto.getName(), dto.getKor(), dto.getEng(), dto.getMath(), total, avg);
        }
    }
}
