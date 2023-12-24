package com.code;

public class Main {

	public static void main(String[] args) {
		int [] arr = {40,30,12,9,5,19,80,60,23,45,39};
		
//		selection(arr);
		insertionSort(arr);
		
		for(int val:arr)
		{
			System.out.print(val + " ");
		}
		System.out.println();
		

	}
	
	public static void selection(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int min = i;
			for(int j = min+i; j<arr.length; j++) 
			{
				if(arr[j] < arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			
			
		}
	}
	
	
//	public static int bubbleSort(int [] arr)
//	{
//		int passes
//		
//	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<i ;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	

}
