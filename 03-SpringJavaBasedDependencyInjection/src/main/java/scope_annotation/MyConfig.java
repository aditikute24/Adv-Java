package scope_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import NoUniqueBeanDefinition.Employee;

@Configuration
@ComponentScan(basePackages = "scope_annotation")
public class MyConfig {

	
}
