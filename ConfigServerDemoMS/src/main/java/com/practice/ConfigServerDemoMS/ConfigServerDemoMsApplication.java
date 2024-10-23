package com.practice.ConfigServerDemoMS;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerDemoMsApplication.class, args);
	}

}
