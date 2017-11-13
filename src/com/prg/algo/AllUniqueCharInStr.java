package com.prg.algo;

public class AllUniqueCharInStr {

	public static void main(String[] args) {
		String str = "test";
		
		System.out.println(isUnique(str));
	}

	private static boolean isUnique(String str) {
		
		if (str == null || str.trim().length()==0) return false;
		
		boolean [] unique = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
			if (unique[str.charAt(i)]) {
				return false;
			}
			unique[str.charAt(i)] = true;
		}
		return true;
	}
	
	
}
