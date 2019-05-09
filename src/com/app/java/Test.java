package com.app.java;

public class Test {

	public void m1() {
		System.out.println("vaagdevi Engineering college");
	}

	public void m2() {
		m1();
		System.out.println("sr engineerig college");
	}

	public void m4() {
		System.out.println("sandeep");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m2();
	}
}
