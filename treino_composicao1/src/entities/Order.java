package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem (OrderItem item) {
		
		
		
	}

	public void removeItem(OrderItem item) {
		
		
		
	}
	
	public double total() {
		
		double sum = 0.0;
		for(OrderItem it : items){
			sum = sum + it.subTotal();
		}
		return sum;
	}
	
}
