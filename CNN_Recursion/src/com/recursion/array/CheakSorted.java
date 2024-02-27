package com.recursion.array;

public class CheakSorted {

	public static boolean cheakSorted(int []input) {
		
		if(input.length<=1) {
			return true;
		}
		
		int []smallInput=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		
		boolean smallAns=cheakSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] input = { 5,1,8, 3 };
		System.out.println(cheakSorted(input));

	}

}
