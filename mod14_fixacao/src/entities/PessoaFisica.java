package entities;

public class PessoaFisica extends Pessoa{

	public PessoaFisica() {
		
	}
	
	private double despesaSaude;
	
	public PessoaFisica(String nome, double impostoAnual, double despesaSaude) {
		super(nome, impostoAnual);
		this.despesaSaude = despesaSaude;
	}

	public double getDespesaSaude() {
		return despesaSaude;
	}


	public void setDespesaSaude(double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}



	@Override
	public double impostos() {

			if (getImpostoAnual() < 20000) {		
				return getImpostoAnual() * 0.15;
			}
			else {
				return (getImpostoAnual() * 0.25) - (despesaSaude * 0.5);
			}
	}
	
	
	
}
