package work2;

public class Methods {

	public static void main(String[] args) {
		findNumber();

	}
	
	
	public static void findNumber () {
		
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6 };
		int wantedNumber = 6;
		boolean thereIs = false;

		for (int number : numbers)
		{
			if (number == wantedNumber) 
			{
				thereIs = true;
				break;
			}
		}
		
		String message;
		if (thereIs) 
		{
		message = ("There is Number: " + wantedNumber); 
		messageShow (message);
		}
		else
		{
			System.out.println("No number: " + wantedNumber);
		}
		
	}
	
	
	public static void messageShow (String message) {
		
		System.out.println(message);
		
	}
	

}
