package ioc;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class PrintQuotes  implements CommandLineRunner{
@Autowired
//@Qualifier("hardWork")

Quotes friendship;

@Autowired
Quotes quotes2;

@PostConstruct
public void init() {
	System.out.println("PostConstruct");
	System.out.println(friendship);
	System.out.println(quotes2);

}
 

public void setQuotes2(Quotes quotes2) {
	this.quotes2 = quotes2;
}




@PreDestroy

public void beforeDestroy() {
	System.out.println("preDestroy");
}
	@Override
	public void run(String... args) throws Exception {
		 for(var quot: quotes2.getQuote())
			  System.out.println(quot);
		
	}

}
