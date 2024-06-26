package com.girish.EmployeeEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EmployeeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeEurekaServerApplication.class, args);
	}

}
