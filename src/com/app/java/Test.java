package com.app.java;

public class Test {

	public void m1() {
		System.out.println("vaagdevi Engineering college");
	}

	public void m2() {
		m1();
		System.out.println("sr engineerig college");
	}

	public void m3() {
		System.out.println("jayamukhi eng college");
		m2();
		m1();
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m2();
	}
}
