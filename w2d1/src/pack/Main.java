package pack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) throws Exception {
		inserisciNumero();
//		consumoKm();
		
		
		
	}
	
	public static void inserisciNumero() throws Exception {
		int[] number = {1,6,3,9,2};
		
		while(true) {
			try {

			System.out.println("insert array position (1 to 5) to modify");
			int position = sc.nextInt();
			if(position == 0 ) {
				System.out.println("bye");
				break;
			}
			if(position < 1 || position > 5) {		
					throw new Exception("exceeded array lenght try again.");
			}
			System.out.println("insert value you want to change (1 to 10)");
			int value = sc.nextInt();
			if(value < 1 || value > 10) {		
				throw new Exception("exceeded number");
		}
			number[position-1] = value;
			System.out.println(Arrays.toString(number));
			}catch(Exception e) {
				System.out.println("Error: " +e.getMessage());
				
			}
			
			
		}

	}

   	public static void consumoKm() {
   		System.out.println("insert km");
   		int km = sc.nextInt();
   		System.out.println("insert litre");
   		int litre = sc.nextInt();
   		try {
   			Es2.calcoloConsumo(km, litre);
   		}catch(Exception e) {
   			System.out.println(e);
   		}
   		
   	}
}