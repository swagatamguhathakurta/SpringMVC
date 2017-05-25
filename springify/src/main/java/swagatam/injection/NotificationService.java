package injection;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private  AmazonEmailService email;

    public NotificationService(AmazonEmailService email){
        this.email=email;
    }

    public void sendNotification(String to, String message){
        this.email.sendEmail(to,message);
    }
}
