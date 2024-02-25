package com.fundamentals;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i = i + 1;
		}

//		int i = 1;
//		while (i <= n) {
//			System.out.println("Hello");
//			i = i + 1;
//		}

	}

}
