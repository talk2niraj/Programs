import java.util.Scanner;

public class DiamondAlgo {

	public static void main(String[] args) {
		System.out.print("Enter number:");
		int n = new Scanner(System.in).nextInt();
		printDiamond(n);
	}
	
	public static void printDiamond(int n) {
		for (int i = 1; i < n; i++) {
			System.out.println();
			printPadding(n-i);
			for (int j = 0; j < i; j++) {
				System.out.print(j+ " ");
			}
		}
		for (int i = n; i > 0; i--) {
			System.out.println();
			printPadding(n-i);
			for (int j = 0; j < i; j++) {
				System.out.print(j+ " ");
			}
		}
	}

	private static void printPadding(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
		
	}
}
