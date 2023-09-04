package BitMagic;

public class FindTwoOddOccuringNumber {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 4, 3, 4, 8, 4, 4, 32, 7, 7 };

		findTheTwoOddEle(arr);
	}

	private static void findTheTwoOddEle(int[] arr) {

		int xor = 0, res1 = 0, res2 = 0;

		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
//		System.out.println(xor);

		// for finding the rightmost set bit...
		int sn = xor & ~(xor - 1);

//		System.out.println(sn);

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & sn) != 0) {
				res1 = res1 ^ arr[i];
			} else {
				res2 = res2 ^ arr[i];
			}
		}
		System.out.println(res1 + " " + res2);
	}

}
