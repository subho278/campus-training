import java.util.Scanner;

public class ZNumber {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Length of array");
		int length = input.nextInt();
		String array[] = new String[length];
		System.out.println("Enter zdigit");

		for (int i = 0; i < length; i++) {

			array[i] = input.next();

		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
		   sb.append( array[i] );
		}
		String newString = sb.toString();
		if (newString.matches("[A-Z0]+")){
			System.out.println("ZNumber is " + newString);
		}
		else {
			System.out.println("IllegalArgumentException");
		}
				
	}

}
