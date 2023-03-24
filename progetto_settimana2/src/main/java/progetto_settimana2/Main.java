package progetto_settimana2;

import java.io.IOException;

import lombok.ToString;

@ToString
public class Main {

	public static void main(String[] args) throws IOException {
		Book book1 = new Book("Alfio", Book_Genre.ADVENTURE,"le avventure di Lanim",2020,376);
		Book book2 = new Book("Alfio", Book_Genre.HISTORY,"La guerra di Lanim",2017,220);
		Book book3 = new Book("Alfio", Book_Genre.ADVENTURE,"GigaIapi",2022,300);
		Book book4 = new Book("Alfio", Book_Genre.THRILLER,"l'assassinio di bebo",2010,578);
		Book book5 = new Book("Giuseppe", Book_Genre.ADVENTURE,"la storia di Lanim",2020,456);
		Book book6 = new Book("Alfio", Book_Genre.ADVENTURE,"le vicende di Alfredo",2017,306);
		Book book7 = new Book("Alfio", Book_Genre.HISTORY,"13... giorni di stipendio",2022,376);
		Book book8 = new Book("Alfio", Book_Genre.ADVENTURE,"Bastianich",2009,110);
		
		Magazine magazine1 = new Magazine(Magazine_frequency.MONTHLY,"Le avventure di bebo",2020,153);
		Magazine magazine2 = new Magazine(Magazine_frequency.HALF_YEARLY,"Alfonzo",1998,350);
		Magazine magazine3 = new Magazine(Magazine_frequency.MONTHLY,"Le avventure di Lanim",2020,253);
		Magazine magazine4 = new Magazine(Magazine_frequency.MONTHLY,"Le avventure di Luca",2020,300);
		Magazine magazine5 = new Magazine(Magazine_frequency.MONTHLY,"Le avventure di Dani",2019,2);
		Magazine magazine6 = new Magazine(Magazine_frequency.WEEKLY,"Nu Piezz",1998,1057);
		Magazine magazine7 = new Magazine(Magazine_frequency.WEEKLY,"Le avventure di bebo 2",2021,187);
		Magazine magazine8 = new Magazine(Magazine_frequency.MONTHLY,"Le avventure di bebo 3",2023,78);
		
		
		Catalogo catalogo = new Catalogo();
		
		catalogo.addToCatalogo(book1);
		catalogo.addToCatalogo(book2);
		catalogo.addToCatalogo(book3);
		catalogo.addToCatalogo(book7);
		catalogo.addToCatalogo(book5);
		catalogo.addToCatalogo(magazine2);
		catalogo.addToCatalogo(magazine1);
		catalogo.addToCatalogo(magazine4);
		catalogo.addToCatalogo(magazine8);
		catalogo.addToCatalogo(magazine5);
	
		
		Catalogo.WriteFile(catalogo);
		Catalogo.ReadFile();
		
	}	

}
