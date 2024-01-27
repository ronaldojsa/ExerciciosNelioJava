package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

	public UsedProduct() {
		
	}
	
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName()
		+ " (used)"
		+ " $ "
		+ getPrice()
		+ " (Manufacture date: "
		+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		+ ")"
		;
	}
	
	
}
