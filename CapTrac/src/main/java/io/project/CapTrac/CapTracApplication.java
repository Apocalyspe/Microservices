package io.project.CapTrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "io.project.CapTrac.dao")
@SpringBootApplication
@EnableEurekaClient
public class CapTracApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapTracApplication.class, args);
	}

}
