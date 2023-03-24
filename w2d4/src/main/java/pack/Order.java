package pack;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private long id;
	private String status;
	private LocalDate localDate;
	private LocalDate deliveryDate;
	List<Product> products;
	Customer customer;
	
	public Order(long id, String status,LocalDate startDate,LocalDate endDate, List<Product> product,Customer customer) {
		this.id = id;
		this.status= status;
		this.localDate = startDate;
		this.deliveryDate = endDate;
		this.products = product;
		this.customer = customer;
	}
	
}
