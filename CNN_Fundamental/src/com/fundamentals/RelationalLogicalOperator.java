package com.fundamentals;

public class RelationalLogicalOperator {

	public static void main(String[] args) {

		int a = 10, b = 3;

		System.out.println("(a > b) = " + (a > b));
		System.out.println("(a < b) = " + (a < b));
		System.out.println("(a == b) = " + (a == b));
		System.out.println("(a != b) = " + (a != b));
		System.out.println("(a >= b) = " + (a >= b));
		System.out.println("(a <= b) = " + (a <= b));
		System.out.println();

		System.out.println("(a >= 10 && b > 10) = " + (a >= 10 && b > 10));
		System.out.println("(a >= 10 || b > 10) = " + (a >= 10 || b > 10));
		System.out.println();

		System.out.println("!(a > b) = " + !(a > b));

	}

}
