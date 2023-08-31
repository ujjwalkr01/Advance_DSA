package BitMagic;

import java.util.Scanner;

public class CountBitSet {

	static int table[] = new int[256];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(countTheBitSet_Brian_Kernighan_Algorithm(n));

		// alternate method ---> lookup Table
		intialize();
		System.out.println(countTheSetBit(n));
	}

	private static void intialize() {

		table[0] = 0;
		for (int i = 0; i < 256; i++) {
			table[i] = (i & 1) + table[i / 2];
		}
	}

	private static int countTheSetBit(int n) {

		return table[n & 0xff] + table[(n >> 8) & 0xff] + table[(n >> 16) & 0xff] + table[n >> 24];
	}

	private static int countTheBitSet_Brian_Kernighan_Algorithm(int n) {

		int res = 0;

		while (n > 0) {
			n = n & (n - 1);
			res++;
		}
		return res;
	}

}
