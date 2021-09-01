package in.javaport.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javaport.service.PeopleService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		PeopleService peopleService = (PeopleService) context.getBean("service");
		peopleService.getEmployee().setName("Erjon from main");
		System.out.println(peopleService.getCustomer().getName());
		//System.out.println(peopleService.getEmployee().getName());
		//System.out.println(peopleService.getCustomer().getName());
		

	}

}
