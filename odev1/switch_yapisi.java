package ahmethan;

public class switch_yapisi {

	public static void main(String[] args) {
		/* Not_değeri_ile_ilgili_örnek */
		char grade = 'P';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok İyi : Geçtiniz");
			break;
		case  'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case  'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case  'F':
			System.out.println("Başarısız : Kaldınız");
			break;
		case  'G':
			System.out.println("Girilmedi : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz!!!");
		
		}
	}

}
