package com.patterns;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		basicPattern(n);
//		squarePattern1(5);
//		squarePattern2(n);
//		squarepatter3(5);
//		triangularPattern1(5);
//		triangularPattern2(5);
//		triangularPattern3(n);
//		characterPattern1(5);
//		characterPattern2(5);
//		charaterPattern3(5);
//		mirrorImage1(5);
		mirrorImage2(5);

	}

	public static void basicPattern(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n) {
				System.out.print("* ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void squarePattern1(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n) {
				System.out.print(i + " ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void squarePattern2(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void squarepatter3(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n) {
				System.out.print(n - j + 1 + " ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void triangularPattern1(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void triangularPattern2(int n) {

		int count = 1;
		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= i) {
				System.out.print(count);
				count = count + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void triangularPattern3(int n) {

		int i = 1;
		while (i <= n) {
			int count = i;
			int j = 1;
			while (j <= i) {
				System.out.print(count + " ");
				count = count + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void characterPattern1(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n) {
				char jthChar = (char) ('A' + j - 1);
				System.out.print(jthChar);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void characterPattern2(int n) {

		int i = 1;
		while (i <= n) {

			char ch = (char) ('A' + i - 1);
			int j = 1;
			while (j <= n) {
				System.out.print(ch);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void charaterPattern3(int n) {

		int i = 1;
		while (i <= n) {
			char ch = (char) ('A' + i - 1);
			int j = 1;
			while (j <= n) {
				System.out.print(ch);
				ch = (char) (ch + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void mirrorImage1(int n) {

		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= n - i + 1) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

	public static void mirrorImage2(int n) {

		int i = 1;
		while (i <= n) {

			int spaces = 1;
			while (spaces <= n - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}

			int stars = 1;
			while (stars <= i) {
				System.out.print("*");
				stars = stars + 1;
			}

			System.out.println();
			i = i + 1;
		}
	}

	public static void invertedPattern(int n) {

		//

	}
}
