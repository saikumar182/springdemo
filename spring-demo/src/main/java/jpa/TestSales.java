package jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public  class TestSales implements CommandLineRunner {
	@Autowired
	private SalesRepo salesRepo;
	
	//public void DisplayAllProductsId(int id) {
		
		   
//				for (var s :salesRepo.findByProduct(id))
//				System.out.println(s.toString());
	//}
//	         
//	public void displayQtyBetween(int min,int max) {
//		
//		for(var s:salesRepo.findByQty(min , max))
//			
//			System.out.println(s.toString());
//		
	//}
//
//	public void displayAscendingOrderOfQuantity() {
//		for(var s:salesRepo.ascendingOrderOfQuantity())
//			System.out.println(s.getProduct()+"  "+s.getQty());
//	}
	

	public void displayAscendingOrderOfQuantity() {
		for(var s:salesRepo.ascendingOrderOfQuantity())
			System.out.println(s.getProduct()+"  "+s.getQty());
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(TestSales.class, args);
		
	}
		

	

	@Override
	public void run(String... args) throws Exception {
       // Print first page of Sales
//	   for(var s : salesRepo.findAll(PageRequest.of(0,5)))
//	   {
//		   System.out.println(s);
//	   }
	
	//	DisplayAllProductsId(101);
//   
//	   for(var s : salesRepo.findAll(PageRequest.of(0,5, Sort.by("amount").descending())))
//	   {
//		   System.out.println(s);
		
		//displayQtyBetween(1,3);
		displayAscendingOrderOfQuantity();
//	   }
	}

}