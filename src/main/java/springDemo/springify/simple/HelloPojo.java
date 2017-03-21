package springDemo.springify.simple;

import org.springframework.stereotype.Component;

//@Component
public class HelloPojo {

	private final String version;
	public HelloPojo(String ver) {
		version=ver;
	}
	
	public void sayHello(){
		System.out.println("Spring me up! ");
	}
}
