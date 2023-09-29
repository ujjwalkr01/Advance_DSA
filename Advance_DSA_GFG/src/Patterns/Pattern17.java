package Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int n = str.length();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print(str.charAt(i - 1));
				} else if (j == n - i + 1) {
					System.out.print(str.charAt(i - 1));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
