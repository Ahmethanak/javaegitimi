package work2;

public class Methods2 {

	public static void main(String[] args) {
		
		String message = citybring();
		System.out.println(message);

		int sum = sum(1,4);
		System.out.println(sum);
		
		
		int sum2 = sum2(0,1,2,3,4,5,6,7,8,9);
		System.out.println(sum2);
		
	}
	
	
	public static void insert() {
		System.out.println("insert");
	}
	
	
	public static void delete() {
		System.out.println("delete");
	}
	
	
	public static void update() {
		System.out.println("update");
	}
	
	
	public static int sum (int number1 , int number2) {
		return number1 + number2 ;
	}
	
	public static int sum2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; 
		}
		return sum;
		
	}
	
	public static String citybring () {
		return "Konya" ;
	}
	
}
