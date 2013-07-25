import java.util.Scanner;


public class StingLoader {
	
	private String loadedString;
	private String reversedString;
	
	
	
	public StingLoader(String loadedString){
		
		this.loadedString = loadedString;
		
		
	}

	
	public String getReversedString(){
		
		
		return reversedString;
		
	}
	
	
	public static String reversString(String loadedString){
		StringBuilder tempString = new StringBuilder(loadedString);
		tempString.reverse();
		return tempString.toString();
		
	}

	public static boolean isPalindorme(String loadedString){
		
		loadedString = loadedString.replaceAll("\\s", "");
		StringBuilder tempString = new StringBuilder(loadedString);
		tempString.reverse();
		
		if(loadedString.equals(tempString.toString()))
		return true;
		else return false;
			
	}

	
	
}
	

