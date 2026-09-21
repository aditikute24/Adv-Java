package NoUniqueBeanDefinition;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {

	@Override
	public void run() {
		System.out.println("Running By Petrol");
		
	}

}
