package com.recursion.array;

public class SumOfNaturalNumbers {

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return sum(n - 1) + n;
	}

	public static void main(String[] args) {

		int n = 10;
		System.out.println(sum(n));

	}

}
