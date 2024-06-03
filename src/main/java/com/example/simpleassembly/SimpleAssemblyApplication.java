package com.example.simpleassembly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.simpleassembly.*")
@ComponentScan("com.example.simpleassembly.*")
public class SimpleAssemblyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAssemblyApplication.class, args);
    }
}
