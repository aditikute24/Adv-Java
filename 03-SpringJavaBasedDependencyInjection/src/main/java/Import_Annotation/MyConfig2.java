package Import_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {
	@Bean
	public Student getStudent() {
		return new Student();
	}

}
