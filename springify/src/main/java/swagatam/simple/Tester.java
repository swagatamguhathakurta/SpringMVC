package swagatam.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester  {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Hello hello = context.getBean(Hello.class);
        hello.sayHello();

        context.close();
    }
}
