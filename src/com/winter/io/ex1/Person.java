package com.winter.io.ex1;

public class Person {
	private final String name;
	private final int age;

	public Person(string name, int age) {
		this.name = name;
		this.age = age;
	}

	public String name() {
		return this.name;
	}

	public int age() {
		return this.age;
	}

	@Override
   public int hashCode() {  ... }

	@Override
   public boolean equals(Object obj)

	@Override
  public String toString()  { ... }
}
