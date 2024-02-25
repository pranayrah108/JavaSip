package com.fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("Both is positive");
		} else {
			System.out.println("Both are not Poaitive");
		}

		if (a > 0 || b > 0) {
			System.out.println("One is positive");
		} else {
			System.out.println("Both are not Positive");
		}

		if (a == b) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
