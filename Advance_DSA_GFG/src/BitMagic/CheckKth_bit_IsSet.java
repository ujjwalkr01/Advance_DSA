package BitMagic;

import java.util.Scanner;

public class CheckKth_bit_IsSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

//		method-1 using left shift operator...
		if (checkIF_kthBit_IsSet(n, k)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

//		method-2 using right shift operator.....
		if (checkIF_kthBit_IsSet_RightShift(n, k)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean checkIF_kthBit_IsSet_RightShift(int n, int k) {

		if ((n & (n >> (k - 1))) == 1) {
			return true;
		} else {
			return false;
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
