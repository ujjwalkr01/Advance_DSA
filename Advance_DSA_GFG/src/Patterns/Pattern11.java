package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = i % 2 == 0 ? 0 : 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = (k == 0) ? 1 : 0;
			}
			System.out.println();
		}

	}

}
