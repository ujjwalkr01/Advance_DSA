package BitMagic;

public class SwappingTwoNumber {

	public static void main(String[] args) {

		int a = 2, b = 5;

		// swapping the numbers using bit;
		a ^= b;
		System.out.println(a);
		b ^= a;
		a ^= b;

		System.out.println(a + " " + b);
	}

}
