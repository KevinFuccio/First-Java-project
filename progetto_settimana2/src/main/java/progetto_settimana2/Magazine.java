package progetto_settimana2;

import lombok.ToString;

@ToString

public class Magazine extends Archivio {


	Enum<Magazine_frequency> frequencyOfPublishing;

	public Magazine(Enum<Magazine_frequency> frequencyOfPublishing, String titolo, Long anno, int nPagine) {
		super(titolo, anno, nPagine);
	
		this.frequencyOfPublishing = frequencyOfPublishing;

	}

	

	public String toString() {
		return "\n" + "\nTitle: " + this.titolo + "\nNumber of pages:" + this.numberOfPages + "\nYear of publishing: "
				+ this.yearOfPublishing + "\nISBN CodeMagazine: " + super.getISBN();

	}
}
