package com.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class HtProjectDemoWeek1Application {

	public static void main(String[] args) {
		SpringApplication.run(HtProjectDemoWeek1Application.class, args);
	}

}
