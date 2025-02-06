package com.proyecto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProyectDemoAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectDemoAuthApplication.class, args);
	}

}
