package PACK_PROGETTO;

public class video extends multimediale {
	private int durata;
	static int luminosita;
	
	public video(String titolo,int durata) {
		super(titolo);
		this.durata = durata;
	}
	public void play() {

		if(this.durata == 0) {
			System.out.println("inserisci una durata.");
		}else {
			for(int i=0; i< this.durata; i++) {
				System.out.print(titolo);
				for(int j=0;j< audio.volume; j++) {
					System.out.print("!");
				}
				for(int k=0;k< luminosita; k++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
		}
	}
	public void alzaLuminosita(){
		if(luminosita >= 0) {
			luminosita++;
		}else if(luminosita == 10) {
			luminosita = 10;
		}
		
	}
	public void abbassaLuminosita(){
		if(luminosita >= 0) {
			luminosita--;
		}else {
			System.out.println("luminosita gia a 0");
		}
	}
}
