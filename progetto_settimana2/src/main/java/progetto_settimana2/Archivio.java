package progetto_settimana2;

public class Archivio {

	private static Long counter = 1l;
	public String titolo;
	private int yearOfPublishing;
	int numberOfPages;
	private Long ISBN = 0l;

	public Archivio(String string, int i, int j ) {

	        this.titolo=string;
	        this.yearOfPublishing=i;
	        this.numberOfPages=j;
	        setISBN();

	    }
	private void setISBN() {
		this.ISBN = counter++;
	}

	public Long getISBN() {
		return this.ISBN;
	}
	public int getYearOfPublishing() {
		return this.yearOfPublishing;
	}
}
