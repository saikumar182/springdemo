package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TestProduct implements CommandLineRunner {

//Product prod2;
@Autowired
private ProductRepo prorepo;

public static void main(String[] args) {
	SpringApplication.run(TestProduct.class, args);

} 

//public void displayAllProducts() {
//
//	for(var p:prorepo.findAll())
//		System.out.println(p);
//}
//
//public void displayLongProducts(double minlen,double maxlen) {
//	
//	for(var c:prorepo.getLongProducts(minlen,maxlen))
//		System.out.println(c.getName());
////}
//public void displayProductName(String name){
//
//	for (var p : prorepo.findByNameContainingIgnoreCase(name))
//		System.out.println(p.getName());
//	
	
////}
//public void displayAllNames() {
//for (var p : proRepo.getLessNames())
//	System.out.printf("%s  %f",p.getName(),p.getPrice());
//}

@Override
public void run(String... args) throws Exception {
	
	//displayAllProducts();
//	displayLongProducts(3000.0, 10000.0);
//
//prod2=prorepo.findById(102).get();
//prod2.setPrice(prod2.getPrice()*0.1+prod2.getPrice());
//prorepo.save(prod2);

// displayProductName("");
	// TODO Auto-generated method stub
	//displayAllNames();
}}	
