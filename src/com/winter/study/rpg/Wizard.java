package com.winter.study.rpg;

public class Wizard {
	//이름, 체력, 마나, 주문력,경험치, 레벨,
	String name;
	int damage;
	int hp;
	int mp;
	Staff staff;
	int gold=0;

	public Wizard() {
		this.name="마법사";
		this.damage=10;
		this.hp=100;
		this.mp=100;
		this.ataff = new Staff();
	}
	
	
	
	// main
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	// 공격
	public void attack(Monster [] moster) {
		
		for (int i=0;i<monsters.lenth;i++) {
		
		
		System.out.println("베기");
		m.hp=m.hp-(this.damage+this.staff.damage 
		//  어떤 몬스터의 hp를 깍을려고 한다
}
	public static void main(String[] args) {
		
	}
	

	public void info() {
		System.out.println(this);
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.damage);
		System.out.println("hp : " + hp);
	}
}