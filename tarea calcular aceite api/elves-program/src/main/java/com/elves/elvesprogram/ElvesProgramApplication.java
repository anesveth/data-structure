package com.elves.elvesprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElvesProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElvesProgramApplication.class, args);
	}

}
