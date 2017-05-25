package injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService service = context.getBean(NotificationService.class);

        service.sendNotification("sguhatha@hawk.iit.edu","How are you");

        context.close();
    }
}
