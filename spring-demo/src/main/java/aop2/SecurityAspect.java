 package aop2;

 import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class SecurityAspect {

	public SecurityAspect() {
		System.out.println("SecurityAspect()");
	}
	

	// Before Advice
	@Before(value = "execution (* aop2.OrderServices.*(..))") // pointcut 
	public void beforeAdviceMethod(JoinPoint jp) {
		//System.out.println(jp.getClass());
		System.out.println("Before Advice --> " + jp.getSignature());
	}

	@After(value = "execution (* aop2.OrderServices.validatecc(..))")
	public void afterAdviceMethod(JoinPoint jp) {
		System.out.println("After Advice --> " + jp.getSignature());
	}
	
	@Around(value = "execution (* aop2.OrderServices.process(..))")
	public void aroundAdviceMethod(ProceedingJoinPoint pjp) {
		System.out.println("Before calling : " + pjp.getSignature());
		try {
			Object obj = pjp.proceed(pjp.getArgs()); // Call method in Target Object
			System.out.println("Success : " + obj);
		} catch (Throwable ex) {
			System.out.println("Exception : " + ex);
		}
		System.out.println("Finally : " + pjp.getSignature());
	}
}
