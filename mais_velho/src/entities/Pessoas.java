package entities;

public class Pessoas {
	
	private String name;
	private Double idade;
	public Pessoas(String name, Double idade) {
		this.name = name;
		this.idade = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getIdade() {
		return idade;
	}
	public void setIdade(Double idade) {
		this.idade = idade;
	}
	
	

}
