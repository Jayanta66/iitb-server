package com.iitb.iitb_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IitbServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IitbServerApplication.class, args);
	}

}
