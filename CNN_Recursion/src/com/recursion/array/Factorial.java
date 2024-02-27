package com.recursion.array;

//recursion in comp sci is a method where the solution to 
//a proble depends on solutions to smaller instance of the same
//problem.
public class Factorial {

//solution of bigger problem is depends upon solution of the smaller problem

	public static int fact(int n) {

		if (n == 0) {
			return 1;
		}

		int smallAns = fact(n - 1);
		return n * smallAns;
	}

	public static void main(String[] args) {

		int n = 5;
		int ans = fact(n);
		System.out.println(ans);

	}

}
