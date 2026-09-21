package Bean_Lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import NoUniqueBeanDefinition.Employee;

@Configuration
@ComponentScan(basePackages = {"demo"})
public class MyConfig {

}
