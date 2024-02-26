package com.code;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		str = sc.nextLine();
		System.out.println(str + " " + str.length());

		String str2 = sc.next();
		System.out.println(str2 + " " + str2.length());

	}

}
