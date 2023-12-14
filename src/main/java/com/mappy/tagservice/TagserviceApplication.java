package com.mappy.tagservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TagserviceApplication {

	public static void main(String[] args) {
		System.setProperty("application.properties", "tag-server");
		SpringApplication.run(TagserviceApplication.class, args);
	}

}
