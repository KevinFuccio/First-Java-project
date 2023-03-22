package w2d3;

public class Es1 implements Runnable {
		String symbol;
		int number;
		public Es1(String s,int n) {
			this.symbol = s;
			this.number = n;
			
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< this.number; i++) {
			System.out.println(this.symbol);
		}
		
	}

}
