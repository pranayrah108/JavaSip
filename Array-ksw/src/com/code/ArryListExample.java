package com.code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryListExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>list=new ArrayList<>(5);
		
		/*
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		
		System.out.println(list);
		
		System.out.println(list.contains(55));
		System.out.println(list);
		
		System.out.println(list.contains(100));
		System.out.println(list);
		
		list.set(1, 500);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		
		*/
		
		//input
		System.out.println("Enter the elements in the list: ");
		for(int i=0;i<5;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		System.out.print(list);
		
		

	}

}
