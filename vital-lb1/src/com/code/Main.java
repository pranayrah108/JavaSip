package com.code;

public class Main {

	public static void main(String[] args) {

//		helloWorld();
//		addTwoNum(64, 36);
//		swapTwoNum(5, 10);
//		evenOdd(8);
//		evenOdd(9);
//		isDivisible(89);
//		isDivisible(35);
//		calIncomeTax(600000);
//		vowelOrConsonant('a');
//		vowelOrConsonant('z');
//		triangleIsValidOrNot(10, 10, 10);
//		triangleIsValidOrNot(45, 45, 90);
//		factorial(5);
//		factorial(4);
//		exponential(2, 3);
//		isPrime(5);
//		isPrime(12);
//		sumOfSeries(10);
//		sumOfSeries(5);
//		reverseNumber(12345);

		/*
		 * int num = 12321; int result = isPallidrome(num); if (result == num)
		 * System.out.println("Your number is Pallindrome"); else
		 * System.out.println("Your Number is Not Pallindrome");
		 */

		sumOfEvenOdd(10);
		printAllPrimeNum(20);
	}

	public static void helloWorld() {
		System.out.println("Hello World");
	}

	public static void addTwoNum(int num1, int num2) {
		System.out.println("Sum of " + num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void swapTwoNum(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + " num2 = " + num2);
	}

	public static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("The " + num + " is EVEN Number");

		} else {
			System.out.println("The " + num + " is ODD Number");
		}
	}

	public static void isDivisible(int num) {
		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("The number " + num + " is divisible by 5 and 7");
		} else {
			System.out.println("The number " + num + " is not divisible by 5 and 7");
		}
	}

	public static void calIncomeTax(double salary) {
		if (salary < 150000) {
			double incomeTax = (salary * 0 / 100);
			System.out.println("Income Tax = " + incomeTax);

		} else if (salary > 150000 && salary <= 300000) {
			double incomeTax = (salary * 20 / 100);
			System.out.println("Income Tax = " + incomeTax);

		} else {
			double incomeTax = (salary * 30 / 100);
			System.out.println("Income Tax = " + incomeTax);

		}
	}

	public static void vowelOrConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel.");
		} else {
			System.out.println(ch + " is a consonant.");
		}
	}

	public static void triangleIsValidOrNot(int angle1, int angle2, int angle3) {
		int sum = (angle1 + angle2 + angle3);
		if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
			System.out.println("Trinagle is valid.");
		} else {
			System.out.println("Tringle is not valid.");
		}
	}

	public static void factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial = " + factorial);
	}

	public static void exponential(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = base * result;
		}
		System.out.println("exponent = " + result);
	}

	public static void isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime.");
				return;
			}
		}
		System.out.println(num + " is prime.");
	}

	public static void sumOfSeries(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;

		}
		System.out.println("Sum of Series up to " + num + " = " + sum);
	}

	public static void reverseNumber(int num) {
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse of number is = " + sum);
	}

	public static int isPallidrome(int num) {

		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		return sum;
	}

	public static void sumOfEvenOdd(int num) {
		int even = 0;
		int odd = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("Sum of Even = " + even + " Sum of Odd = " + odd);
	}

	public static void printAllPrimeNum(int num) {
		int prime;
		for (int i = 2; i < num; i++) {
			prime = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = 0;
					break;
				}
			}
			if (prime == 1) {
				System.out.print(i + " ");
			}
		}

	}
	
	

}
