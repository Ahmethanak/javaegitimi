package work2;

public class MiniProject5 {

	public static void main(String[] args) {

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

		if (thereIs) 
		{
			System.out.println("There is Number : " + wantedNumber);
		} 
		else
		{
			System.out.println("No number...");
		}

	}

}
