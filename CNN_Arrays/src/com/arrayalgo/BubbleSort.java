package com.arrayalgo;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 7, 4, 3, 9, 2, 6 };
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		bubbleSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
