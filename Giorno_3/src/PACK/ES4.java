package PACK;

public class ES4 {
	public void contoAllaRovescia() {
		System.out.println("inserisci numero");
		int numero = Main.sc.nextInt();
		for(int i = numero; i >= 0; i--) {
			System.out.println(i);
			if(i == 0) {
				System.out.println("finito!");
			}
		}
	}
}
