import java.io.IOException;
import java.util.Scanner;

public class StringRevers {

	public static void main(String[] args) {

		Scanner scannerString = new Scanner(System.in);
		try {
			String loadText = scannerString.nextLine();
			System.out.println(StingLoader.reversString(loadText));

			if (StingLoader.isPalindorme(loadText)) {
				System.out.println("This is Palindrome!!");
			} else {

				System.out.println("It is not Palindrome!!");
			}
		} catch (Exception e) {
			System.out.println("to nie string");
		}

	}

}
