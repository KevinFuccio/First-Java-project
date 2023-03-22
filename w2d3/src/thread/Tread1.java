package thread;

public class Tread1 extends Thread{
	String msg;
	int n;
	public Tread1(String msg,int n) {
		this.msg = msg;
		this.n= n;
	}
	public void run() {
		for(int i = 0; i< this.n; i++) {
			System.out.print(this.msg);
		}
	}
}
