package ahmethan;

public class diziler {

	public static void main(String[] args) {
		
		String student1 = "Ahmethan AK";
		String student2 = "Engin Demirog";
		String student3 = "Muhammed Arıcı";
		String student4 = "Fatih Baş";
		String student5 = "Cengiz Dağ";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		
		
		System.out.println("----------------");
		
		String[] students = new String [4];
		students[0] = "Ahmethan";
		students[1] = "Engin";
		students[2] = "FAtih";
		students[3 ] = "Cengiz";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		
		System.out.println("-------Doğru Kullanımı--------");
		
		for(String student : students)
		{
			System.out.println(student);
		}

		
		
	}

}
