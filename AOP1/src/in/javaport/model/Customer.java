package in.javaport.model;

public class Customer {
	private String name;

	public String getName() {
		return name;
	}
	
	public String getX() {
		return "from getX";
	}
	
	public String getX(int x) {
		return "from getX with one parameter";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	

}
