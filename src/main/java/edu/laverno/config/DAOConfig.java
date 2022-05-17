package edu.laverno.config;

import edu.laverno.dao.PersonDAO;
import edu.laverno.dao.PersonDAOSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {

    @Bean
    public PersonDAO personDAO() {
        return new PersonDAOSimple();
    }
}
