package jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class TestJdbc implements CommandLineRunner {
	@Autowired
	ProductManager prod;
	 

	@Autowired
	CategoryManager cat;
	 

	public static void main(String[] args) {
		SpringApplication.run(TestJdbc.class, args);
	}
	
	
	public void run(String... args) {
		//prod.showProductAvg();
		//cat.insertData() ;
	//	cat.printCategoryAvgPrice();
	
	}

}
