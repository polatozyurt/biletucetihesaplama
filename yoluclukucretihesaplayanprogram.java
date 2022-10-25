import java.util.Scanner;

public class yoluclukucretihesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// yolculuk ücretini yolcunun yaþýna ve bilet türüne göre sýnýflandýrýp planlayan program,
		int kms, age, wayTicket;
		
		
		System.out.print("Mesafeyi km türünden giriniz :");
		kms = input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz :");
		age = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		wayTicket = input.nextInt();
		
		double normalPrice =kms* (0.1);
		double babyPrice = normalPrice* (0.5);
		double teenPrice = normalPrice* (0.9);
		double elderPrice = normalPrice* (0.7);
		
		
		
		if(kms>0) {
		
		
		if(	wayTicket == 1) {
			if(age<=12) {
				System.out.print("Toplam Tutar =" +babyPrice + "TL");
				
			}
			else if (age<=24) {
				System.out.print("Toplam Tutar =" +teenPrice + "TL");
			}
			else if (age < 65) {
				System.out.print("Toplam Tutar =" +normalPrice + "TL");
			}
			else {
				System.out.print("Toplam Tutar =" +elderPrice + "TL");
			}
		}
		else if(wayTicket == 2) {
			
			
			
			if(age<=12) {
				System.out.print("Toplam Tutar =" +babyPrice*1.6 + "TL");
				
			}
			else if (age<=24) {
				System.out.print("Toplam Tutar =" +teenPrice*1.6 + "TL");
			}
			else if (age < 65) {
				System.out.print("Toplam Tutar =" +normalPrice*1.6 + "TL");
			}
			else {
				System.out.print("Toplam Tutar =" +elderPrice*1.6 + "TL");
			}
		}
		else {
			System.out.println("Yanlýþ bir bilet türü seçtiniz!! Tekrar deneyiniz...");
		}
			
		}
		else {
			System.out.print("Km deðeri pozitif bir deðer olmalýdýr");
		}
		
		
	}
		

		
		

}
	