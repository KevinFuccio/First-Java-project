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
		this.stipendio();
		
	}
	
	public Dipendente(Dipartimento dipartimento, double stipendio,double importoOrarioStraordinario,Livello livello) {
		this(dipartimento,livello);
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	
	public void infoDipendente() {
		System.out.println("matricola: "+this.matricola + "\n"+ "dipartimento: "+ this.dipartimento + "\n"+ "livello: "+ this.livello + "\n" + this.stipendio);
	}
	
	public double promuovi() {
		
		if(this.livello == Livello.OPERAIO) {
			this.livello = Livello.IMPIEGATO;
			System.out.println("sei stato promosso a " +this.livello);
			
		}else if(this.livello == Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			System.out.println("sei stato promosso a " +this.livello);
			
		
			
		}else if(this.livello == Livello.QUADRO) {
			this.livello = Livello.DIRIGENTE;
			System.out.println("sei stato promosso a " +this.livello);
			
			
			
		}else if(this.livello == Livello.DIRIGENTE){
			System.out.println("non ci sono piu promozioni hai raggiunto il livello massimo");
			
		}
		
			return this.stipendio();
		
		
	}
public double stipendio() {
		
		if(this.livello == Livello.OPERAIO) {
			
			return this.stipendio;
			
		}
		if(this.livello == Livello.IMPIEGATO) {
			
			this.stipendio = this.stipendioBase * 1.2;
			return this.stipendio;
	
		}
		if(this.livello == Livello.QUADRO) {
			
			this.stipendio = this.stipendioBase * 1.5;
			return  this.stipendio;
			
		}
		if(this.livello == Livello.DIRIGENTE){
			
			this.stipendio = this.stipendioBase * 2;
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
