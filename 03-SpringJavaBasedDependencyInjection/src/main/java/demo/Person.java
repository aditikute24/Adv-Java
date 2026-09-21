package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("101")
	private int id;
	@Value("Aditi")
	private String name;
	@Autowired
	private Mobile mobile;
	public Person() {
    }
	

	public Person(int id, String name, Mobile mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

}
