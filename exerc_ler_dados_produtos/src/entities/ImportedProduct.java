package entities;

public class ImportedProduct extends Product{

	
	private Double customsFee;
	
	
	private ImportedProduct() {
		super();
	}


	public ImportedProduct(String name, Double price, Double custromsFee) {
		super(name, price);
		this.customsFee = custromsFee;
	}


	public Double getCustromsFee() {
		return customsFee;
	}


	public void setCustromsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		 
		return getPrice() + customsFee;
		
	}
	
	
	
	@Override
	public String priceTag() {
				
		return getName () 
				+ " $ "
				+ String.format("%.2f", totalPrice())
				+" (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
		
		
	}
	
	

		
	}
		
	
