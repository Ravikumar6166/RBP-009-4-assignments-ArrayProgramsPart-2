package com.bridgrlabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println(a + " is not Prime number");
		} else {
			System.out.println(a + " is a Prime number");
		}
	}
}
