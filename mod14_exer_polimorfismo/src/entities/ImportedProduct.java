package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}


	public ImportedProduct(Double customFee) {
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName()
		+ " $ "
		+ String.format("%.2f", totalPrice())
		+ " (Custom fee: $ "
		+ String.format("%.2f",customFee)
		+")"
		;
	}
	
	public Double totalPrice() {
		return super.getPrice() + customFee
		;
		
	}
	
}
