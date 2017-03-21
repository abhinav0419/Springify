package springDemo.springify.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		NotificationService notification = context.getBean(NotificationService.class);
		notification.sendNotification("Abhi", "Pinku");
		context.close();
	}
}
