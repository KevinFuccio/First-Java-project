package pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(1, "bebo", 1);
		Customer c2 = new Customer(2, "dani", 2);
		Customer c3 = new Customer(3, "luca", 1);
		Customer c4 = new Customer(4, "kevin", 1);
		Product p1 = new Product(1, "TV_LG", "elettronica", 399.99);
		Product p2 = new Product(2, "SMARTHPHONE", "elettronica", 799.99);
		Product p3 = new Product(3, "VESTITO_BLU", "abbigliamento", 55.99);
		Product p4 = new Product(4, "LE_MAGIE_DI_ALFONSO", "books", 117.99);

		List<Product> arrayProduct1 = new ArrayList<Product>();
		arrayProduct1.add(p1);
		List<Product> arrayProduct2 = new ArrayList<Product>();
		arrayProduct2.add(p2);
		List<Product> arrayProduct3 = new ArrayList<Product>();
		arrayProduct3.add(p3);
		List<Product> arrayProduct4 = new ArrayList<Product>();
		arrayProduct4.add(p4);

		Order o1 = new Order(1, "delivered", LocalDate.parse("2023-02-20"), LocalDate.parse("2023-02-22"),
				arrayProduct1, c1);
		Order o2 = new Order(1, "delivered", LocalDate.parse("2023-03-24"), LocalDate.parse("2023-04-02"),
				arrayProduct2, c2);
		Order o3 = new Order(1, "delivered", LocalDate.parse("2023-01-22"), LocalDate.parse("2023-02-01"),
				arrayProduct3, c3);
		Order o4 = new Order(1, "delivered", LocalDate.parse("2023-02-04"), LocalDate.parse("2023-02-10"),
				arrayProduct4, c4);

		List<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		

	}

}
