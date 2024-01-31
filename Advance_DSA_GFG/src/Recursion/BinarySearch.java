package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 5, 8, 13 };

		int start = 0, end = arr.length - 1;
		int target = 8;

		System.out.println(searchBinarySearch(arr, start, end, target));
	}

	public static int searchBinarySearch(int arr[], int start, int end, int target) {

		if (start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {
			return mid;
		}

		if (arr[mid] > target) {
			return searchBinarySearch(arr, start, mid - 1, target);
		}
		return searchBinarySearch(arr, mid + 1, end, target);
	}
}
