import java.io.IOException;
import java.util.Scanner;

public class StringRevers {

	

	public static void main(String[] args) {

		
	Scanner scannerString = new Scanner(System.in);
	try{
	StingLoader St = new StingLoader(scannerString.nextLine());
	St.reversString();
	System.out.println(St.getReversedString());
	}
	catch(Exception e){
		System.out.println("to nie string");
	}

	
	}

}
