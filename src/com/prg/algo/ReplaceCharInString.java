package com.prg.algo;

public class ReplaceCharInString {

	public static void main(String[] args) {
		String str = "Vegeterian foos is always goos.";
		
		System.out.println("String with typo error: "+str);

		str = replaceChar(str, 's', 'd');
		
		System.out.println("String after typo error correction: "+str);
		
	}
	
	
	public static String replaceChar(String str, char toBeReplaced, char toReplaceWith) {
		char[] charArray = str.toCharArray();
		for (int i=0; i < str.length(); i++) {
			if(charArray[i] == toBeReplaced) {
				charArray[i] = toReplaceWith;
			}
		}
		
		return new String(charArray);
	}
}

