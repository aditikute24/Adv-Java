package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("201")
	private int id;
	@Value("Xiaomi")
	private String brand;
	@Value("250000")
	private double price;
	
	 public Mobile() {
	    }

	public Mobile(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}
