package in.javaport.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())")
	public void loggingBeforeAdvice() {
		System.out.println("This is logging before advice...applied to all and any getName method");
		
	}
	
	@Before("execution(public String get*(. .))")
	public void loggingBeforeAdviceGeneric() {
		System.out.println("This is logging before advice...applied to all and any get method with or without parameters");
		
	}
	
	@Before("execution(public void set*(. .))")
	public void loggingBeforeAdviceGenericSet() {
		System.out.println("This is logging before advice...applied to all and any set method with or without parameters");
		
	}
	
	@After("execution(public String getName())")
	public void loggingAfterAdvice() {
		System.out.println("This is logging after advice...applied to all and any getName method");
		
	}
	
	@After("execution(public int *(. .))")
	public void loggingAdviceIntReturnType() {
		System.out.println("This is logging after advice...applied to all and any add method");
		
	}
	
	@Before("getAllEmployeeMethods()")
	public void loggingBeforeForAllEmployeeMethods() {
		System.out.println("This is logging before advice...applied to all and any method without parameters in the Employee class");
		
	}
	
	//@Pointcut("execution(public * in.javaport.model.*.*(*))")
	//public void getAll() {}
	
	@Pointcut("within(in.javaport.model.Employee))")
	public void getAllEmployeeMethods() {}

}
