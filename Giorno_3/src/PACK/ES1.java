package PACK;

public class ES1 {
	public void pariDispari() {
		System.out.println("inserisci parola");
		String text = Main.sc.nextLine();
		if(text.length() %2 == 0) {
			System.out.println("pari");
		}else {
			System.out.println("dispari");
		}
	}
	public void annoBisestile(int anno) {
		if(anno %4 == 0) {
			System.out.println("anno bisistile");
		}else {
			System.out.println("rip");
		}
	}
}
