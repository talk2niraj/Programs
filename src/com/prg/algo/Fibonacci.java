package com.prg.algo;

public class Fibonacci {
	public static void main(String[] args) {
		int previous = 0, next = 1;

		System.out.println(next);
		
		while(next < 100) {
			int temp = next;
			next = previous + next;
			System.out.println(next);
			previous = temp;
		}
	}

}
