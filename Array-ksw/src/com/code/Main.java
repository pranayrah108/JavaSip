package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr1= {23,12,45,32,15};
		System.out.println(arr1[2]);
		
		//-----------------------------
		
		int[] arr=new int[5];
		//input
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Output
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int num:arr)
			System.out.print(num +" " );
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		//---------------------------
		
		String[] str=new String[4];
		
		//Input
		System.out.println("Enter the Strig elements: ");
		for(int i=0;i<str.length;i++)
			str[i]=sc.next();
		
		//Output
		for(int i=0;i<str.length;i++)
		System.out.print(str[i] + " ");
		
		System.out.println();
		
		for(String ch: str)
			System.out.print(ch+" ");
		
		System.out.println();
		
		System.out.println(Arrays.toString(str));
		
		System.out.println();
		
		//modify
		
		str[1]="java";
		
		System.out.println(Arrays.toString(str));
		
		

	}

}
