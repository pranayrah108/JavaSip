package com.arrayalgo;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = min + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 40, 30, 12, 9, 5, 19, 80, 60, 23, 45, 39 };
		for (int val : arr) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		selectionSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
