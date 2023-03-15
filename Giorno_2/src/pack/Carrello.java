package pack;

public class Carrello {
	String cliente = "";
	Articolo[] elencoArticoli = new Articolo[5];
	int totaleCarrello = 0;
	public Carrello() {
		Cliente client = new Cliente();
		this.cliente = client.nome;

	}

}
