package com.eventoapp1.eventoapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.eventoapp1.repository")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.eventoapp1.controllers"})
@EntityScan(basePackages = {"com.eventoapp1.models"})


public class Eventoapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eventoapp1Application.class, args);
	}

}
