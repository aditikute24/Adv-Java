package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import NoUniqueBeanDefinition.Employee;

@Configuration
@ComponentScan(basePackages = {"demo","main","NoUniqueBeanDefinition"})
public class MyConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
