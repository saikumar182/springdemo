package ioc;

import java.util.List;

//import org.springframework.stereotype.Component;

//@Component
public class HardWork  implements Quotes{

	 public HardWork() {
		 System.out.println("hardwork()");
	 }
@Override
public List<String> getQuote() {
		
		return List.of("Hard work beats talent when talent doesn’t work hard.",
				"Luck is great, but most of life is hard work",
				"With hard work and effort, you can achieve anything." ,
				"Work harder than you think you did yesterday");
	}
	

}
