package Bean_Lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Mobile {
	
	public Mobile() {
		System.out.println("Constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initalization");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruction");
	}

}
