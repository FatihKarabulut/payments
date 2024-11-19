package com.coca_cola.raffle_web_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.coca_cola.raffle_web_service")
public class PanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanelApplication.class, args);
	}

}
