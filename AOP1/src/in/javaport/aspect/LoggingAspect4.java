package in.javaport.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect4 {
	@Pointcut("execution(public String getName())")
	public void getAll() {}
	
	@Around("getAll()")
	public void AroundAdvice(ProceedingJoinPoint point){
		try {
			System.out.println("Before advice");
			point.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After finally");
		
	}

}
