package BitMagic;

public class FindOneOddOccuringNumber {

	public static void main(String[] args) {

		// its fixed that there will be only one odd occuring time number

		int arr[] = new int[] { 4, 4, 4, 4, 5, 5, 3, 3 };

		System.out.println(findTheOddRepeatingEle(arr));
	}

	private static int findTheOddRepeatingEle(int[] arr) {

		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
