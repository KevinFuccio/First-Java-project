package pack;

public class Sim {
	long numero = 9999999999l;
	double credito = 0;       
	Chiamata[] registroChiamate = new Chiamata[5];
	public Sim() {
		
	}
	public Sim(long x) {
		numero = x;
	}
	public void ricaricaCredito(int ricarica) {
		credito = ricarica;
		System.out.println("il tuo credito e': " + ricarica + " euro");
	}
	public void effettuaChiamata(long x) {
		if(credito > 0) {			
			Chiamata c = new Chiamata(x,1,credito);
		}else {
			System.out.println("il tuo credito e' insufficiente");
		}
	}
	public void controlloCredito() {
		Chiamata credito = new Chiamata();
		credito.setCredito(this.credito);
	}
}
