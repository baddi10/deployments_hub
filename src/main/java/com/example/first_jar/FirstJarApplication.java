package com.example.first_jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@Controller
public class FirstJarApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstJarApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "index"; // maps to src/main/resources/templates/index.html
	}

}

