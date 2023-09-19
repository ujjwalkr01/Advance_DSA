package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			char k = 'A';
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

}
