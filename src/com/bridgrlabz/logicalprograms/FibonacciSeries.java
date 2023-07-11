package com.bridgrlabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter a number : ");
		int num = scan.nextInt();
		int a = 0;
		int b = 1;
		int nextTerm = 0;
		System.out.print(a + " , " + b + " , ");
		for (int i = 2; i < num; i++) {
			nextTerm = a + b;
			a = b;
			b = nextTerm;
			System.out.print(nextTerm + " , ");
		}
	}

}
