package com.winter.study.rpg;

public class Staff {
	// 이름, 공격력, 방어력, 레벨, 속성, 내구도, 공속,

	String name;
	int damage;
	// 캐릭터가 사용가능한 레벨 제한
	int level;

	// 기본 생성자를 선언
//각 멤버변수의 값을 임의의값으로 초기화

	public Staff() {
		this.name="나무 지팡이";
		this.damage=10
		this.level =1;
	}

	public void info() {
		System.out.println(this);
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.damage);
		System.out.println("레벨 : " + this.level);
		
	}
}
