package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n * 2) - 1; j++) {
				if (j >= n - (i - 1) && j <= n + (i - 1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
