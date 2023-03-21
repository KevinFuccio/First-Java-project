package w2d2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("inserisci numero di parole");
//		
//		int x = sc.nextInt();
//		
//		sc.nextLine();
//				
//		arrCreate(x);
		System.out.println("inserisci numeri");
		
		int y = sc.nextInt();
//		
		sc.nextLine();
				
		List<Integer> a =numeriRandom(y);
			arrInverso(a);
			pariDispari(a,true);
	}
	
	public static void arrCreate(int numero){
		
		
		HashSet<String> arrParole = new HashSet();
		HashSet<String> paroleDuplicate = new HashSet();
		
		for(int i=1; i <= numero; i++) {
			
			System.out.println("inserisci parola");
			
			String text = sc.nextLine();
			
			
			if(!arrParole.add(text)) {
				paroleDuplicate.add(text);
			}
		}
		System.out.println(paroleDuplicate);
		System.out.println(arrParole.size());
		System.out.println(arrParole);
		
	}
	
	public static List<Integer> numeriRandom(int numero) {
		List<Integer> numeri = new ArrayList<>();
		
		for(int i = 0; i< numero; i++) {
			numeri.add((int) ((Math.random()*100)+1));
		}
		System.out.println(numeri);
		return numeri;
	}
	public static List<Integer> arrInverso(List<Integer> a) {
		List<Integer> lista = new ArrayList<>(a);
		Collections.reverse(lista);
        lista.addAll(a);
        System.out.println(lista);
        return lista;
	}
	 private static void pariDispari(List<Integer> lista, boolean stampaPari) {
         System.out.print("Valori in posizioni " + (stampaPari ? "pari" : "dispari") + ": ");
         if(stampaPari) {
        	 for (int i = 0; i < lista.size(); i += 2) {
        		 System.out.print(lista.get(i) + " ");
        	 }
        	 
         }else {
        	 for (int i = 1; i < lista.size(); i += 2) {
        		 System.out.print(lista.get(i) + " ");
        	 }

         }
     }
 
}

