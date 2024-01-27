package entities;

public abstract class Pessoa {
	
	private String nome;
	private double impostoAnual;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, double impostoAnual) {
		this.nome = nome;
		this.impostoAnual = impostoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getImpostoAnual() {
		return impostoAnual;
	}

	public void setImpostoAnual(double impostoAnual) {
		this.impostoAnual = impostoAnual;
	}
	
	
	public abstract double impostos();
	
	
}
