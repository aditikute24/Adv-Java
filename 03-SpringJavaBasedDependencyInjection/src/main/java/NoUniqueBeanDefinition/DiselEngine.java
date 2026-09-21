package NoUniqueBeanDefinition;

import org.springframework.stereotype.Component;

@Component
public class DiselEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Running By Disel");
		
	}

}
