package com.renz.samplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.renz")
@EntityScan("com.renz.samplerestapi.entities")
@EnableJpaRepositories("com.renz.samplerestapi.repository")
public class SampleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApiApplication.class, args);
	}

}
