package Bean_Lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Employee;

public class Driver {
	public static void main(String[] args) {

		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		con.close();
		


	}

}
