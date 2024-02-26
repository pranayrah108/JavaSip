package com.code;

public class StringDemo {

	public static void main(String[] args) {

		char[] arr = { 'C', 'o', 'd', 'i', 'n', 'g' };

		String str = "";// empty string
		String str1 = "Coding"; // String -> non primitive datatype
		String str2 = " is fun";
		String str3 = "Coding";

		// str1=str1.concat(str2);
		// str1+=str2;

		System.out.println(str.length());
		System.out.println(str1.charAt(2)); // str[i] not allowed
		System.out.println(str1.length());

		System.out.println(str1);
		System.out.println(str1.equals(str3));
		System.out.println(str1.compareTo(str3));
		System.out.println("contain fn ->" + str1.contains("ing"));

		System.out.println(str1.substring(2)); // char 2 onward
		String substr = str1.substring(4);
		System.out.println(substr.length());

		String substr1 = str1.substring(1, 5);
		System.out.println(substr1);
		System.out.println(substr1.length());

	}

}
