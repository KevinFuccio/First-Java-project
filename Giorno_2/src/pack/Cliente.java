package pack;

public class Cliente {
	int codiceCliente = 0;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
	public Cliente() {
		Name();
		Surname();
	}
	public void Name() {
		System.out.println("inserisci nome");
		String text = Main.sc.nextLine();
		this.nome = text;
	}
	public void Surname() {
		System.out.println("inserisci cognome");
		String text = Main.sc.nextLine();
		this.cognome = text;
	}
	public void visualizzaDati() {	
			System.out.println("Nome: "+ nome + " Cognome: " + cognome);
	}
}
