import java.util.Scanner;

public class ZDigit {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter the zdigit:");
		String zdigit = input.nextLine();
		if (zdigit.matches("[A-Z0]")){
			System.out.println(zdigit);
		}
		else {
			System.out.println("IllegalArgumentException");
		}
	}

}
