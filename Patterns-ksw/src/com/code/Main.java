package com.code;

public class Main {

	public static void main(String[] args) {
		
//		pattern1(6);
//		pattern2(5);
//		pattern3(5);
//		pattern4(5);
//		pattern5(6);
		pattern6(6);   //NA
		
		
	}
	
	static void pattern6(int n) {     //NA//
		for(int i= 1 ;i<= 6;i++) {
			for(int j= 1;j<=i ;j++) {
				System.out.print(" ");
				
				for(int k=1;k<6;k++)
					System.out.print(k);  //NA
				System.out.println();
				
			}
		
		}
	}
	
	static void pattern5(int n) {
		for(int row= 0 ;row<= 2*n ; row++) {
			int TotalColsInrow= row > n ? 2 * n-row : row;
			for(int col= 0 ;col< TotalColsInrow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	static void pattern4(int n) {
		for(int row=1; row<=n ;row++) {
			for(int col=1; col<=n ;col++) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
	}
	
	
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col =1;col<= n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	static void pattern2(int n) {
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	static void pattern1(int n) {
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
		
	

}
