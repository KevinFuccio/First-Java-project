package pack;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	public Rettangolo(double b,double a) {
		base = b;
		altezza = a;
	}
	
	public double getPerimetro() {
		double perimetro = ((base+altezza)*2);
		return perimetro;
	}
	public double getArea() {
		double a= base*altezza;
		return a;
	}
	
	public void stampaRettangolo() {
		System.out.println("base: " + base + " " + "altezza: " + altezza);
	}
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		System.out.println("base rettangolo1: " + r1.base + " " + "altezza rettangolo1: " + r1.altezza);
		System.out.println("base rettangolo2: " + r2.base + " " + "altezza rettangolo2: " + r2.altezza);
	}
}
