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
	
	
	public void reversString(){
		StringBuilder tempString = new StringBuilder(loadedString);
		tempString.reverse();
		reversedString = tempString.toString();
		


	}
	
}
	

