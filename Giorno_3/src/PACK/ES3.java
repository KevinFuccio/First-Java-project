package PACK;

public class ES3 {
	String text;
	public void While() {
		do {
			System.out.println("inserisci una parola");
			text = Main.sc.next();
			String[] letters = text.split("");
			System.out.println(String.join(",",text));
		} while(!text.equals("q"));
		System.out.println("fatto");
	}
}
