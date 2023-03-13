package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		int num1 = 10;
		int num2 = 25;
		System.out.println(somma(num1,num2));
		String parola = "me";
		System.out.println(parola + num2);
		
		String[] arrParole = {"ciao", "a", "piace", "Java","forse"};
		int[] a = new int [5];
		
		String[] newArr = new String[arrParole.length +1];
		int j = 0;
		for(int i = 0; i < newArr.length; i++) {
			if(i == 2) {
				newArr[i]= parola;
			}else {
				newArr[i] = arrParole[j]; 
				j++;
			}
		}
		System.out.println(Arrays.toString(newArr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci la prima parola");
		
		String testo1 = sc.nextLine();
		
		System.out.println("inserisci la seconda parola");
		
		String testo2 = sc.nextLine();
		
		System.out.println("inserisci la terza parola");
		
		String testo3 = sc.nextLine();
		
		System.out.println("questa e la tua frase: " + testo1 +" " + testo2 + " " + testo3);
		
		String inputText = testo1 +" " + testo2 + " " + testo3, nsrt="";
		char ch;
		for(int i = 0; i < inputText.length(); i++) {
			ch= inputText.charAt(i);
			nsrt = ch+nsrt;
		}
		
		System.out.println("al contrario sara: " + nsrt);
		
		System.out.println(perimetroRettangolo(2.75,5.34));
		
		System.out.println(pariDispari(2));
		
		System.out.println(perimetroTriangolo(3,4));
		}

public static int somma(int x,int y) {
	return x + y;
}
public static double perimetroRettangolo(double x,double y) {
	double sum = x+y;
	return sum*2;
}
public static String pariDispari(int x) {
	if(x % 2 == 0 ) {
		return ("il numero e pari");
	}else {
		return ("il numero e dispari" );
	}
}

public static int perimetroTriangolo(int x, int y) {
	int sum = x*y;
	System.out.println(sum);
	return sum/2;
	}
}




