package com.winter.io.ex1;

public class Student {
	private int no;
	private String name;

	prblic Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode = no = name.hashCode();
		return hashCode;
	}

	@Override
   Public boolead

	equals(Object obj) {
	   if(obj instanceof Student target) {
		  if(ne == target.getNo() && name.equals(target.getName)))  {
	 }
   }
   return false;
     }
 }
