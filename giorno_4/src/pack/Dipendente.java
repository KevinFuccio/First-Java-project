package pack;

public class Dipendente {
	private static int count = 0;
	static double stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public Dipendente(Dipartimento dipartimento) {
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello= Livello.OPERAIO;
		this.matricola= count++;
		this.dipartimento = dipartimento;
	}
	
	public Dipendente(Dipartimento dipartimento,Livello livello) {
		this(dipartimento);
		this.livello= livello;
		this.stipendio = promuovi();
		this.importoOrarioStraordinario = 30;
		this.matricola= count++;
		
	}
	
	public Dipendente(Dipartimento dipartimento, double stipendio,double importoOrarioStraordinario,Livello livello) {
		this.matricola= count++;
		this.livello = livello;
		this.dipartimento = dipartimento;
		this.stipendio = promuovi();
		this.importoOrarioStraordinario = 30;
	}
	
	public void infoDipendente() {
		System.out.println("matricola: "+this.matricola + "\n"+ "dipartimento: "+ this.dipartimento + "\n"+ "livello: "+ this.livello);
	}
	
	public double promuovi() {
		
		if(this.livello == Livello.OPERAIO) {
			this.livello = Livello.IMPIEGATO;
			this.stipendio = 1000;
			System.out.println("sei stato promosso a " +this.livello);
			return this.stipendio;
			
		}else if(this.livello == Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			this.stipendio = this.stipendio * 1.2;
			System.out.println("sei stato promosso a " +this.livello);
			return this.stipendio;
			
		}else if(this.livello == Livello.QUADRO) {
			this.livello = Livello.DIRIGENTE;
			this.stipendio = this.stipendio * 1.5;
			System.out.println("sei stato promosso a " +this.livello);
			return  this.stipendio;
			
		}else if(this.livello == Livello.DIRIGENTE){
			System.out.println("non ci sono piu promozioni hai raggiunto il livello massimo");
			this.stipendio = this.stipendio * 2;
			return this.stipendio;
		}
			return this.stipendio;
		
		
	}
	
	public static void calcolaPaga(Dipendente d) {
		System.out.println("Stipendio del dipendente n: "+ d.matricola +" paga mensile: " + d.stipendio);
	}
	
	public static double calcolaPaga(Dipendente d, double oreStraordinario) {
		double somma = 30 * oreStraordinario;
		
		return (d.stipendio + somma);
	}
}
