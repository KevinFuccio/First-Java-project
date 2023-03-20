package pack;

public class Es2 {
	private int  km;
	private int litre;
	
	public static void calcoloConsumo(int km, int litre) throws Exception {
		if(km <= 0) {
			throw new Exception("km not valid");
		}else if(litre <= 0) {
			throw new Exception("litre not valid");
		}
		System.out.println("your consumption is: " + (km/litre)+"km per Liter");
	} 
}
