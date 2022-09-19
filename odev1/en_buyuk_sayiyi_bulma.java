package ahmethan;

public class en_buyuk_sayiyi_bulma {

	public static void main(String[] args) {
		int number1 = 500;
		int number2 = 50;
		int number3 = 5;
		int largestNumber = number1;
		
		if (largestNumber<number2)
		{
			largestNumber = number2;
		} 
		
		
		if (largestNumber<number3)
		{
			largestNumber = number3;
		} 
		
		System.out.println("En Büyük Sayı = " + largestNumber);
		

	}

}
