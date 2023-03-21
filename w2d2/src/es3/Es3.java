package es3;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Es3 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inserisci quanti numeri vuoi inserire");
		int n = sc.nextInt();
		sc.nextLine();
		Map<String, Integer> rubrica = phoneInsert(n);
		removeName(rubrica);
		findName(rubrica);
		findNumber(rubrica);

	}

	public static Map<String, Integer> phoneInsert(int n) {
		Map<String, Integer> rubrica = new HashMap<>();
		for (int i = 0; i < n; i++) {

			System.out.println("inserire nome");
			String name = sc.nextLine();
			System.out.println("inserire numero");
			Integer number = sc.nextInt();
			sc.nextLine();
			rubrica.put(name, number);
		}
		System.out.println(rubrica);
		return rubrica;

	}

	public static Map<String, Integer> removeName(Map<String, Integer> rubrica) {
		System.out.println("inserisci nome da eliminare");
		String text = sc.nextLine();
		if (rubrica.containsKey(text)) {
			rubrica.remove(text);
		}
		System.out.println(rubrica);

		return rubrica;

	}
	
	public static void findName(Map<String, Integer> rubrica){
		System.out.println("inserisci nome da trovare");
		String text = sc.nextLine();
		for(Map.Entry<String,Integer> entry: rubrica.entrySet()) {
			if(entry.getKey().equals(text)) {
				System.out.println("il numero di" + text + " e " + entry.getValue());
				
			}
		}
	}
	public static void findNumber(Map<String, Integer> rubrica){
		System.out.println("inserisci il numero da trovare");
		int num = sc.nextInt();
		sc.nextLine();
		for(Map.Entry<String,Integer> entry: rubrica.entrySet()) {
			if(entry.getValue().equals(num)) {
				System.out.println("il nome del numero " + num + " e " + entry.getKey());
				
			}
		}
		
	}
}
