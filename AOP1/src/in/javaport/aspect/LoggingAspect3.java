package in.javaport.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect3 {
	
	@AfterThrowing("args(name)")
	public void exceptionAdvise(String name) {
		System.out.println("An exception has been thrown " + name);
		
	}

}
