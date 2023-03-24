package progetto_settimana2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Catalogo {
	public List<Archivio> catalogo = new ArrayList<Archivio>();

	public Catalogo() {

	}

	public void addToCatalogo(Archivio oggetto) {
		catalogo.add(oggetto);
	}

	public void removeObjWithISBN(long code) {
		List<Archivio> newCatalogo = catalogo.stream().filter(e -> !e.getISBN().equals(code)).collect(Collectors.toList());
		catalogo = newCatalogo;
	}
	public void searchByISBN(long code) {
		List<Archivio> newCatalogo = catalogo.stream().filter(e -> e.getISBN().equals(code)).collect(Collectors.toList());
		System.out.println(newCatalogo);
	}
	public void searchByYear(int year) {
		List<Archivio> newCatalogo = catalogo.stream().filter(e -> e.yearOfPublishing.equals(year)).collect(Collectors.toList());
		System.out.println(newCatalogo);
	}
	public void searchByAuthor(String author) {
		List<Archivio> newCatalogo = catalogo.stream().filter(e -> e instanceof Book).map(e -> (Book)e).filter(e -> e.author.equals(author)).collect(Collectors.toList());
		System.out.println(newCatalogo);
	}

	
	public String toString() {
		return "\n" + this.catalogo;

	}

}
