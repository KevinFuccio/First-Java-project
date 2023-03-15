package pack;

public class Articolo {
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int nPezziDisponibili;
	
	public Articolo(String descrizione) {
		this.codiceArticolo = 0;
		this.descrizioneArticolo= descrizione;
		this.prezzo = 0;
		this.nPezziDisponibili = 0;
	}
}
