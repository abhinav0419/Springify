package springDemo.springify.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	//property based dependency injection
	@Autowired
	@Qualifier("second")
	private EmailService emailService;
	
	
//	//Constructor based dependency
//	public NotificationService(EmailService emailService){
//		this.emailService = emailService;
//	}
	public void sendNotification(String to, String msg){
	emailService.sendEmail(to, msg );
	}

}
