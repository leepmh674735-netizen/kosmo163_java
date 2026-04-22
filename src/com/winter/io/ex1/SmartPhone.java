package com.winter.io.ex1;

public class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(string company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toSting() {
		return company + "," + os;
	}
 }
