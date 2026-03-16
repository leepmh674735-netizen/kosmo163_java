package com.winter.car;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.info();
		
		Car c3 = new Car("아반뗴, 30000000);"
				c3.info();
		Car c2 = new Car("기아자동차", "K7", 40000000, true);
	}

	// 필드
	String company;
	String model;
	int price;
	boolean manual;// true 수동, false 자동

	// 생성자
	public Car() {
		this("그랜저")
 System.out.println("기본생성자 호출");

	public Car(String model,int price,boolean manual) {
		this.company = "현대자동차";
		this.model = "그랜저";
		this.price = 50000000;
		this.manual = false;
	}

	public Car(String company, String model, int price, boolean manual) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.manual = manual;
		
	}

	public Car(String model) {
		this.company = "현대자동차";
		model = model;
		this.price = 50000000;
		this.manual = false;
		
	}

	}

	public void info() {
		
		System.out.println(this);
		System.out.println("제조사 : " + this.company);
		System.out.println("모델명 : " + this.model);
		System.out.println("가격 : " + this.price);
		System.out.println("수동여부 : " + this.manual);
		
	}
