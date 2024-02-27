package com.code;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(20);// size 4 //capacity =20,default capacity =10;
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);

		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(1));

		arr.remove(2);
		System.out.println(arr);

		arr.set(0, 1000);
		System.out.println(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
