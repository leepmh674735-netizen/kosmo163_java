package com.winter.study.rpg;

public class RpgMain {

	public static void main(String[] args) {
		// 프로그램을 실랭
		// 코드를 테스트
		// 데이터타입 변수명 = new 클래스명()
		
	}
		
		Wizard c = new Wizard();
		c.name = ",마법사";
		Wizard wizard2 = new Wizard();
		Staff staff = new Staff();
		Staff staff2 = new Staff();
		staff.name = " 초보자용";
		staff.damage = 10;
		staff.level = 1;

		c.staff = staff;

		System.out.println(c.name);
		System.out.println(c.mp);
		System.out.println(c.staff.name);

		c.attack();
		wizard2.attack();

		System.out.println(c);
		c.info();

		Monster monster = new Monster();
		monster.name="고블린";
		monster.hp=20;
		monster.damage=5;
//		Staff s = new Staff();
//		monster.staff=s;
		monster.staff=new Staff();
	    wizard.attack(monster);
	}

}
