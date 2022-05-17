package edu.laverno;

import edu.laverno.domain.Person;
import edu.laverno.service.PersonService;
import edu.laverno.service.PersonServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class)) {

            PersonService service = context.getBean(PersonServiceImpl.class);

            Person ivan = service.getByName("Ivan");
            System.out.println("Name: " + ivan.getName() + "; age: " + ivan.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
