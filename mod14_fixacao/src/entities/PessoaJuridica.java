package entities;

public class PessoaJuridica extends Pessoa{

	public PessoaJuridica() {
		
	}
	
	private int numeroFuncionarios;
	
	
	public PessoaJuridica(String nome, double impostoAnual, int numeroFuncionarios) {
		super(nome, impostoAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double impostos() {
		if (numeroFuncionarios <= 10) {
			return getImpostoAnual() * 0.16;
		}
		else {
			return getImpostoAnual() * 0.14;
			
		}
		
	}
	
	
}
