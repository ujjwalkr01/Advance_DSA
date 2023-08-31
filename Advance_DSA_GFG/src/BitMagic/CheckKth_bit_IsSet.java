package BitMagic;

import java.util.Scanner;

public class CheckKth_bit_IsSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (checkIF_kthBit_IsSet(n, k)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean checkIF_kthBit_IsSet(int n, int k) {

		if ((n & (1 << (k - 1))) != 0) {
			return true;
		} else {
			return false;
		}

	}

}
