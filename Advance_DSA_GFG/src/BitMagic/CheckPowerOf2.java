package BitMagic;

import java.util.Scanner;

public class CheckPowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
     
		// Using Brians Kernighan's algorithm
		if (checkPowerOF_Two(num)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean checkPowerOF_Two(int num) {

		if (num == 0) {
			return false;
		}
		return ((num & (num - 1)) == 0);
	}

}
