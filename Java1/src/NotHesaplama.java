import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
	
		int quiz , vize , ffinal;
		double ortalama ;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("quiz notunu giriniz : ");
		quiz = input.nextInt();
		
		System.out.println("vize notunu giriniz : ");
		vize = input.nextInt();
		
		System.out.println("final notunu giriniz : ");
		ffinal = input.nextInt();
		
		ortalama = (quiz * 0.2) + (vize * 0.5) + (ffinal * 0.3);
		System.out.println("not ortalamanız : " + ortalama);
		
		String sonuc = (ortalama >= 50) ? "Başarılı" : "Başarısız";
		System.out.println(sonuc);

	}

}
