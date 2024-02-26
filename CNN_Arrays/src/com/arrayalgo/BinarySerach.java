package com.arrayalgo;

public class BinarySerach {

	public static int binarySearch(int[] arr, int element) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] > element) {
				end = mid - 1;
			} else if (arr[mid] < element) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 7, 10, 20, 35, 40 };
		int index = binarySearch(arr, 89);
		System.out.println("Index is " + index);

	}

}
