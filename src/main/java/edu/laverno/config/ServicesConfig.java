package edu.laverno.config;

import edu.laverno.dao.PersonDAO;
import edu.laverno.service.PersonService;
import edu.laverno.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public PersonService personService(PersonDAO dao) {
        return new PersonServiceImpl(dao);
    }
}
