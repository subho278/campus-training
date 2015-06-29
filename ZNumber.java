import java.util.Scanner;

public class ZNumber {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Length of array");
		int length = input.nextInt();

		String zdigit = new String();
		System.out.println("Enter zdigit");

		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (i < length) {

			zdigit = input.next();
			if (zdigit.matches("[A-Z0]")) {
				sb.append(zdigit);
			}
			i++;
			
		}

		String newString = sb.toString();
		
		if (length == newString.length())
			System.out.println("ZNumber is " + newString);
		else
			System.out.println("IllegalArgumentException");
	}
}