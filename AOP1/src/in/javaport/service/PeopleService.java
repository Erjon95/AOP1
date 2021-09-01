package in.javaport.service;

import in.javaport.model.Customer;
import in.javaport.model.Employee;

public class PeopleService {
	private Employee employee;
	private Customer customer;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
