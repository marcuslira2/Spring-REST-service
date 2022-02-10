package com.spring.guide.spring.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDb {

  private static final Logger log = LoggerFactory.getLogger(LoadDb.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Marcus Lira", "Programador")));
      log.info("Preloading " + repository.save(new Employee("Marcus Lira", "Suporte")));

    };
  }

}
