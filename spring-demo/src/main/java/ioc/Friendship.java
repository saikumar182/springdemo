package ioc;

import java.util.List;

//import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
// @Lazy
@Scope(scopeName="prototype")
public class Friendship implements Quotes {
	
	 public Friendship() {
		 System.out.println("frndshipquote()");
	 }
@Override
	public List<String> getQuote() {
		
		return List.of("No friendship is an accident",
				"True friends are always together in spirit",
				"A sweet friendship refreshes the soul" );
	}

}
