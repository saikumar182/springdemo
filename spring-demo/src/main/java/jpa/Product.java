package jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")

public class Product {

	@Id

	@Column(name = "prodname")

	private String name;

	@Column(name = "price")

	private double price;

	@Column(name = "catcode")

	private String catcode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCatcode() {
		return catcode;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}

	public Product(String name, double price, String catcode) {
		super();
		this.name = name;
		this.price = price;
		this.catcode = catcode;
	}

	public Product() {
		super();
		
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", catcode=" + catcode + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getCatcode()=" + getCatcode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
