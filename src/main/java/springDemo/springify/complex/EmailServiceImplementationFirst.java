package springDemo.springify.complex;

import org.springframework.stereotype.Component;

@Component("first")
public class EmailServiceImplementationFirst implements EmailService{

	@Override
	public void sendEmail(String to, String body) {
		System.out.println("to: "+to);
		System.out.println("body: "+body);		
	}

}
