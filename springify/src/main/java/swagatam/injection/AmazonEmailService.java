package injection;

import org.springframework.stereotype.Component;

@Component
public class AmazonEmailService implements EmailService {
    public void sendEmail(String to, String body) {
        System.out.println("to = [" + to + "], body = [" + body + "]");
    }

}
