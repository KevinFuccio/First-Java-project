package w2d3;

public class Es2 implements Runnable {
	int[] intArr;
	int start;
	int finish;
	public static int[] sommaArr = new int[3];
	
	public Es2(int[] arr, int start, int finish) {
		this.intArr= arr;
		this.start= start;
		this.finish= finish;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int somma = 0;
		for(int i = start; i <finish; i++) {
			somma += intArr[i];
		}
		switch(this.start) {
		case 0:
			sommaArr[0] = somma;
		case 1000:
			sommaArr[1] = somma;
		case 2000:
			sommaArr[2] = somma;
		}
		
	}
}
