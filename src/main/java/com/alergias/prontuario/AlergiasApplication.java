package com.alergias.prontuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class AlergiasApplication {
   /*Projeto de Alergias de prontuário Base Oracle*/
	public static void main(String[] args) {
		SpringApplication.run(AlergiasApplication.class, args);
	}

}
