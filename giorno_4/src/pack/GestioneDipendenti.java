package pack;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente(Dipartimento.PRODUZIONE,Livello.OPERAIO);
		Dipendente d2 = new Dipendente(Dipartimento.PRODUZIONE,Livello.OPERAIO);
		Dipendente d3 = new Dipendente(Dipartimento.AMMINISTRAZIONE,Livello.IMPIEGATO);
		Dipendente d4 = new Dipendente(Dipartimento.VENDITE,Livello.DIRIGENTE);
		
//		d1.promuovi();
//		d3.promuovi();
//		
//		d1.infoDipendente();
//		d2.infoDipendente();
//		d3.infoDipendente();
//		d4.infoDipendente();
//		
//		System.out.println(
//		"somma della paga dei dipendenti: " + 
//		(Dipendente.calcolaPaga(d1, 5)+ 
//		 Dipendente.calcolaPaga(d2, 5)+ 
//		 Dipendente.calcolaPaga(d3, 5)+ 
//		 Dipendente.calcolaPaga(d4, 5))
//		);
		Dipendente.calcolaPaga(d4);
	}

}
