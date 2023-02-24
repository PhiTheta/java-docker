package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaDockerApplication {

	@RequestMapping("/")
	public String home(){
		return "Works with Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaDockerApplication.class, args);
	}

}
