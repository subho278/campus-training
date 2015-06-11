import java.util.Scanner;

public class ZNumberToDecimal {

	private static Scanner input;

	public static void main(String[] args) {

		String base = new String();
		base = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		input = new Scanner(System.in);
		System.out.println("Enter the ZNumber");
		String znumber = input.nextLine();
		if (znumber.matches("[A-Z0]+")) {
			System.out.println("ZNumber is " + znumber);

			int val = 0;
			for (int i = 0; i < znumber.length(); i++) {
				char c = znumber.charAt(i);
				int d = base.indexOf(c);
				val = 26 * val + d;
			}
			System.out.println("Decimal Value of ZNumber is " + val);
		}

		else {
			System.out.println("IllegalArgumentException");
		}
	}
}