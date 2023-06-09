package aop2;

import org.springframework.stereotype.Component;

@Component
public class OrderServices {
  
	public void payment()
	
	{
		 System.out.println("payment completed");
	}
	
	public void validatecc()
	{
		System.out.println("valid");
	}

	public void process()
	{
		System.out.println("processing");
	}

}
