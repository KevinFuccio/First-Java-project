package PACK_PROGETTO;

public class immagine extends multimediale {
	
	
	
	public immagine(String titolo, int luminosita) {
		super(titolo);
		video.luminosita = luminosita;
		
	}
	
	public void show() {

		while(video.luminosita == 0) {
			System.out.println("inserisci una luminosita.");
			video.luminosita = main.sc.nextInt();
		}
			System.out.print(titolo);
			for(int i=0; i< video.luminosita; i++) {
				
				System.out.print("!");
				
			}
			
			System.out.print("\n");
			
			
		}
	 
	
	public void alzaLuminosita(){
		if(video.luminosita >= 0) {
			video.luminosita++;
		}else if(video.luminosita == 10) {
			video.luminosita = 10;
		}
		
	}
	public void abbassaLuminosita(){
		if(video.luminosita>= 0) {
			video.luminosita--;
		}else {
			System.out.println("luminosita gia a 0");
		}
	}
	
}
