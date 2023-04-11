package entities;

public class Employees {
	
	private Integer id = 0;
	private String name = null;
	private Double salary = 0.0;
	
	
	public Employees(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
		
	}
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
				
	
	}
	
	
	
	
	
	

}
