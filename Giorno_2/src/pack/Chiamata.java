package pack;

public class Chiamata {
	long numeroChiamata;
	double durata;
	private double costoAlMinuto = 0.1d;
	public Chiamata() {
		
	}
	public Chiamata(long n,double d,double c) {
		this.numeroChiamata = n;
		this.durata = d;
		System.out.println("hai chiamato: " + numeroChiamata + " durata chiamata: " + durata + " minuti");
		setCredito(c);
	}
	


 public double getPrezzo() {
	return costoAlMinuto * durata;
	}
 public void setCredito(double c) {
	 Sim credito = new Sim();
	 credito.credito = c - getPrezzo();
	 System.out.println(credito.credito + " setCredito");
 }
}