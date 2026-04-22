package com.winter.util;

import jave.util.Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendardar {

	public static void main(String[] args) {
		// 현재 날짜와 시간정보가 들어감
		Calendar calendar = Calendar.getInstance();
		Data date = calendar.getTime();
		
		//calendar.set(Calendar.YEAR, 2030);
		//calender.set(Calendar.MONTH,4);
		calendar.set
		Date date = calendar.getTime();
		
		System.out.println(date);

		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int s = calendar.get(Calendar.SECOND);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH);
		System.out.println(y);
		System.out.println(m);
		System.out.println(h);
		System.out.println(s);

		
	}

}
