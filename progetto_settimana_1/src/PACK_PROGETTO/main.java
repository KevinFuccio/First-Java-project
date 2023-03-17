package PACK_PROGETTO;

import java.util.Scanner;

public class main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("inserisci titolo");
		String title = sc.nextLine();
		System.out.println("durata");
		int durata = sc.nextInt();
		System.out.println("luminosita");
		int luminosita = sc.nextInt();
		
		
		immagine i = new immagine(title,luminosita);
		
		
		i.show();
		
		
		
		
		
		
//		multimediale[] m = new multimediale[5];
//		m[0]= i;
//		if(m[0] instanceof immagine) {
//			immagine y = ((immagine)m[0]);
//			y.prova();
//		}
		
	}

}
