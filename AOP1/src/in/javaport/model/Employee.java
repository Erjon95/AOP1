package in.javaport.model;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw new RuntimeException();
	}
	
	

}
