package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.Employee;
import test.Student;

@Configuration
@ComponentScan(basePackages = { "test", "demo" })
public class Driver {
	public static void main(String[] args) {

		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);

		Student s = (Student) con.getBean("stu");
		Employee e = (Employee) con.getBean("emp");

		System.out.println(s);
		System.out.println(e);

	}

}
