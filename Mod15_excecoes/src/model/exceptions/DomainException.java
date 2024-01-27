package model.exceptions;

public class DomainException extends Exception{   //poderia ser RuntimeException. Aí não teria obrigatoriedade de tratar a exceção no código fonte

	private static final long serialVersionUID = 1L;
	// classe e pacote criados para personalizar a exceção
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
