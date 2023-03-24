package progetto_settimana2;

import lombok.ToString;

@ToString

public class Book extends Archivio {
	
	String author;
	Enum<Book_Genre> genre;

	public Book(String author, Enum<Book_Genre> genre,String titolo, Long anno,int nPagine) {
		super(titolo, anno, nPagine);

		this.author = author;
		this.genre = genre;
	}

	public String toString() {
        return "\n" +"\nTitle: " + this.titolo+"\n" +"Author: "+ this.author + "\nGenre: "+ this.genre + "\nNumber of pages:"+ this.numberOfPages +"\nYear of publishing: "+ this.yearOfPublishing+"\nISBN Code: "+ super.getISBN();

    }
}
