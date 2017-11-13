package com.prg.algo;

import java.util.Scanner;

/**
 * @author nirajkumar
 *
 */
public class Palindrome {

	public static void main(String[] args) throws Exception {
		boolean palindrome = true;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();

		if (null == text || text.trim().length() == 0) {
			throw new Exception("Bad input");
		}

		for (int i = 0, lastIndex = text.length() - 1; i < text.length(); i++, lastIndex--) {
			if (!(text.charAt(i) == text.charAt(lastIndex))) {
				palindrome = false;
				break;
			}

			if (i == lastIndex)
				break;
		}

		System.out.println("Palindrome :: " + palindrome);
	}
}
