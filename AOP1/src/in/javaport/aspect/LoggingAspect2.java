package in.javaport.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect2 {
	@AfterReturning(pointcut="args()", returning = "returnString")
	public void stringArgumentMethods(String returnString) {
		System.out.println("This is the advice " + returnString);
	}
	
	@Before("allEmployeeMethods()")
	public void loggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
		System.out.println(joinpoint.getTarget());

	}
	
	@Pointcut("execution(public String get*())")
	public void args() {}
	
	@Pointcut("within(in.javaport.model.Employee)")
	public void allEmployeeMethods() {}

}
