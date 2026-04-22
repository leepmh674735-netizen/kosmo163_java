package com.winter.util;

import java.util.ArrayList;

public class ListMain2 {

public static void main(String[] args) {
	//generic
   ArrayList list<Object> = new ArrayList();
	list.add(1);
	list.add("two");
	list.add(true);
	
	String n = list.get(1);
	
}
}
