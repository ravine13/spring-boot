package com.aspect 

	import org.aspectj.lang.annotation.Aspect; 
import Java.lang.RuntimeException; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

// Logging class is anotated with @Aspect 
// and will contain advices. 
@Aspect
class Logging { 
} 

// The class ImplementAspect 
// contains method Aspectcall 
// and the advices will be applied 
// on that method for demo. 
public class ImplementAspect { 
	public static void main(String args[]) 
	{ 

		Scanner sc = new Scanner(System.in); 
		System.out.println("my first aspect"); 

		// **Add beanconfiguration file 
		// in your programme when executing.** 
		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext("beanconfigfile.XML"); 

		ImplementAspect call 
			= (ImplementAspect)ctx.getbean("aspect"); 

		System.out.println("enter an integer"); 
		int a = sc.nextInt(); 
		if (a == 1) { 
			throw new RuntimeException(msg); 
		} 
		else { 
			call.aspectCall(); 
		} 
		call.myMethod(); 
	} 

	public void aspectCall() 
	{ 
		System.out.println("Applying advices"
						+ " for the first time"); 
	} 

	public void myMethod() 
	{ 
		System.out.println("This is an"
						+ " extra method"); 
	} 
} 
