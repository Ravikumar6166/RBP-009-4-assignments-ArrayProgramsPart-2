package com.bridgrlabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	static void checkPerfectNumber(int x) {
		int a = x;
		int b = x;
		int sum = 0;
		int i;
		for (i = 1; i < a; i++) {
			if (a % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		if (sum == b) {
			System.out.println(b + " is a Perfect number");
		} else {
			System.out.println(b + " is not a Perfect number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		checkPerfectNumber(num);
	}
}
