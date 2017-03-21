package springDemo.springify.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public HelloPojo getHelloPojo(){
		return new HelloPojo("4.3-Release");
	}
}
