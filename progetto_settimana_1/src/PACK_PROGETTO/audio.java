package PACK_PROGETTO;

public class audio extends multimediale{
	static public int volume;
	private int durata;
	
	public audio(String titolo,int durata) {
		super(titolo);
		this.durata = durata;
		volume = 0;
	}
	
	public void play() {
		
		while(this.durata == 0) {
			System.out.println("inserisci una durata.");
			this.durata = main.sc.nextInt();
			
			
		}for(int i=0; i< this.durata; i++) {
			
			System.out.print(titolo);
			
			for(int j=0;j< volume; j++) {
				
				System.out.print("!");
				
			}
			
			System.out.print("\n");
		}
			
	}
	
	
	public void alzaVolume(){
		if(volume >= 0) {
		volume++;
		}else if(volume == 10) {
			volume = 10;
		}
		
	}
	public void abbassaVolume(){
		if(volume >= 0) {
			volume--;
		}else {
			System.out.println("volume gia a 0");
		}
	}

}
