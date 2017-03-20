package springDemo.springify;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class );
		HelloPojo hello = context.getBean(HelloPojo.class);
		hello.sayHello();
		context.close();	 
	}
   
}
