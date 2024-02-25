package com.fundamentals;

import java.util.Scanner;

public class CheakPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		int div = 2;
//		boolean isPrime = true;

		while (div < n) {
			if (n % div == 0) {
				System.out.println("Composite");
//				isPrime = false;
				return;
			}
			div = div + 1;
		}
		System.out.println("Prime");
//		if (isPrime) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Composite");
//		}

	}

}
