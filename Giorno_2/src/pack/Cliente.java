package pack;

public class Cliente {
	int codiceCliente = 0;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
	public Cliente() {
		codiceCliente++;
		this.nome= "";
		this.cognome= "";
		this.email= "";
		this.dataIscrizione= "";
	}
}
