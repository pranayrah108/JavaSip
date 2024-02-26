package com.arrayalgo;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 6, 3, 7, 2, 8, 1, 5 };
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		insertionSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
