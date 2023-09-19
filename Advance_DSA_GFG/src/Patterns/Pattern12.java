package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= 2 * n; j++) {

				if (j <= i) {
					System.out.print(k++);
				}
				if (j > (2 * n) - i) {
					System.out.print(--k);
				}
				if (j > i && j <= (2 * n) - i) {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
