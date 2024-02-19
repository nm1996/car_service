package com.service.discovery.server;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryServerApplication.class, args);
	}

}
