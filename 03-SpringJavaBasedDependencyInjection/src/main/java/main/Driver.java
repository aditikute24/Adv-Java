package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Employee;

public class Driver {
	public static void main(String[] args) {

		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);

//		Person p = (Person) con.getBean("person");	
//		System.out.println(p);

//		Car c = (Car) con.getBean("car");
//	
//		System.out.println(c);
//		c.e.run();
		
		//without using @component and @componentScan use @Bean
		Employee e = (Employee) con.getBean("getEmployee");	
		System.out.println(e);

	}

}
