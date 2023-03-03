package com.my.demo;

public class Test implements Inter1, Inter2 {

	@Override
	public void diplay() {

		Inter1.super.diplay();
		Inter2.super.diplay();

	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.diplay();
	}
}
