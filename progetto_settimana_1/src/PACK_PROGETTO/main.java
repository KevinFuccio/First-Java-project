package PACK_PROGETTO;

import java.util.Scanner;

public class main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		multimediale[] m = new multimediale[2];
		
		codice(m);
		
		
		
		
		
		
		
//		m[0]= i;
//		if(m[0] instanceof immagine) {
//			immagine y = ((immagine)m[0]);
//			y.prova();
//		}
		
	}
	public static void codice(multimediale[] m) {
		for(int i =0; i < m.length; i++) {
			System.out.println("seleziona che tipologia vuoi visualizzare 1: immagine | 2: audio | 3: video");
			int tipologia = sc.nextInt();
			System.out.println("inserisci titolo");
			String title = sc.next();
			switch(tipologia) {
			case 1:
				System.out.println("luminosita");
				int luminosita = sc.nextInt();
				immagine img = new immagine(title,luminosita);
				m[i] = img;
				break;
			case 2:
				System.out.println("inserisci durata");
				int durata = sc.nextInt();
				audio audio = new audio(title,durata);
				m[i] = audio;
				break;
			case 3:
				System.out.println("inserisci durata");
				durata = sc.nextInt();
				video video = new video(title,durata);
				m[i] = video;
				break;
			default:
				System.out.println("tipo non valido, riprova.");
				i--;
			}
						
		}
		int elemento = -1;
		
		while(elemento != 0) {
			System.out.println("Seleziona l'elemento che vuoi visualizzare. Premi 0 per uscire ");
			elemento = sc.nextInt();
			
			if(elemento >= 1 && elemento <= m.length) {
				multimediale oggetto = m[elemento -1];
				
				if(oggetto instanceof immagine) {
					immagine img = (immagine)oggetto;
					img.show();
					
				}else if(oggetto instanceof audio) {
					audio aux = (audio)oggetto;
					aux.play();
					
				}else if(oggetto instanceof video) {
					video vid = (video)oggetto;
					vid.play();
					
				}else{
					System.out.println("l'elemento che cerchi non e corretto");
				}
			
			}else {
				System.out.println("perche sei uscito? :(");
				sc.close();
			}
			
		}
			
		
	}

}
