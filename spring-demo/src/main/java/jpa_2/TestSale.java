package jpa_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class TestSale implements CommandLineRunner {

	@Autowired
	
	SaleRepo saleRepo;
	public static void main(String args[]) {
		SpringApplication.run(TestSale.class, args);
	}
//	public void displayAscendingOrderOfQuantity() {
//		for(var s:saleRepo.ascendingOrderOfQuantity())
//			System.out.println(s.getProductId()+"  "+s.getQuantity());
//	}
	public void inBetweenRange(int minquantity,int maxquantity) {
	for(var s:saleRepo.getQuantityBetween(minquantity, maxquantity))
		System.out.println(s.getProductId()+" "+s.getQuantity());
	}
	
@Override

public void run(String... args) throws Exception {
//	 for(var s:saleRepo.findAll())
//  System.out.println(s.getInvoiceNumber()+"  "+s.getAmount()+"  "+s.getQuantity());
//	
//	//displayAscendingOrderOfQuantity();
//	for(var s : saleRepo.findAll(PageRequest.of(0,4))) {
//		System.out.println(s);
	inBetweenRange(2,4);
//	}
	
}

}
