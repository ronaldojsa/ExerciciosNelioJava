package entities;

public class Quartos {

	private String name;
	private String email;
	private int numQuarto;

	public Quartos(String name, String email, int numQuarto) {

		this.name = name;
		this.email = email;
		this.numQuarto = numQuarto;


	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
		
	
	
	
	@Override
	public String toString() {
		return "Room " + numQuarto + ": " + name + ",  " + email;
	}
	
	

	
	
}


