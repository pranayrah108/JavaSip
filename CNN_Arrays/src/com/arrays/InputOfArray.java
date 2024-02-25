package com.arrays;

import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at " + i + "th index");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
