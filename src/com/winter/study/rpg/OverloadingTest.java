package com.winter.study.rpg;

public class OverloadingTest {
//  public void hap3(float a,int b) {
//	  System.out.println(a+b);
// }

  public static hap(int a,int b) {
	System.err.println(a+b);
	
}
  public static hap(int a,int b) {
		System.err.println(a+b);
  }
  public int hap(int a,int b) {
	  System.out.println(a+b);
	  return a+b;
	  }