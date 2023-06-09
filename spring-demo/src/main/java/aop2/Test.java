package aop2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test implements CommandLineRunner {
	@Autowired
	private OrderServices pay;

	public void run(String... args) throws Exception {
		//System.out.println(payable.getClass()); // Proxy, target is Order
	pay.payment();
	pay.validatecc();
	pay.process();
//		System.out.println("Order Status " + order.getOrderStatus(1));
	}

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

}