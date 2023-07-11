package com.bridgrlabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	static void method1(int num) {
		int reverseNum = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse number is " + reverseNum);
	}

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		method1(number);
	}

}
