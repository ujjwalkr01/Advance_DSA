package BitMagic;

public class FindtheMissngNum {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 4, 3, 5 };
		int n = arr.length;

		System.out.println(findtheMissingNum(arr, n));
	}

	private static int findtheMissingNum(int[] arr, int n) {

		int x1 = arr[0], x2 = 1;

		for (int i = 1; i < n; i++) {
			x1 = x1 ^ arr[i];
		}
		for (int i = 2; i <= n + 1; i++) {
			x2 = x2 ^ i;
		}
		return x1 ^ x2;
	}

}
