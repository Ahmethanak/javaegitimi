package ahmethan;

public class reCap_Demo2 {

	public static void main(String[] args) {

		double[] myList = { 5.1, 6.8, 9.2, 3.6, 55.9 };
		double total = 0;
		double maxNumber = myList[0];
		for (double number : myList)
		{
			if (maxNumber < number)
			{
				maxNumber = number;
			}
		
			total = number + total;
			System.out.println(number);
		}

		System.out.println("Toplam Değer: " + total);
		System.out.println("En Büyük Sayı: " + maxNumber);
	}

}
