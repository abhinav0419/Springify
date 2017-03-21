package springDemo.springify.complex;

import org.springframework.stereotype.Component;

@Component("second")
public class EmailServiceImplementationSecond implements EmailService{

	@Override
	public void sendEmail(String to, String body) {
		System.out.println("to: "+to);
		System.out.println("body: "+body);	
	}

}
