package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//syntax
		//datatype[] variable_name=new datatype[size]
		
		
		int[] arr1= {23,12,45,32,15};
		System.out.println(arr1[0]);
		
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		
		System.out.println();
 		
		
	//	---------------------------------------------
		
		int[] arr=new int [5];
		
		//Input using loops
		System.out.println("Enter the array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		//Output
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
		
		System.out.println();
		
		// Output using for each loop
		for(int num:arr)
			System.out.print(num +" ");
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		//---------------------------------------------
		
		String[] str=new String[4];
		
		System.out.println("Enter the String element");
		
		//Input
		for(int i=0;i<str.length;i++)
			str[i]=sc.next();
		
		//Output
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]+ "  ");
		
		System.out.println();
		
		for(String ch:str)
			System.out.print(ch + " ");
		
		System.out.println();
		
		System.out.println(Arrays.toString(str));
		System.out.println();
		
		//modify
		str[1]="Ram";
		System.out.println(Arrays.toString(str));
		
		
		
		
		
		
	}

}
