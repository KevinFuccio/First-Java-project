package PACK;

public class ES2 {
	
	public void Switch() {
		System.out.println("inserisci un numero");
		int numero = Main.sc.nextInt();
		switch(numero)	{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("numero non trovato");
		}
	}
	
}
