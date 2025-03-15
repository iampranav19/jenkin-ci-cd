package com.pranav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinscicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinscicdApplication.class, args);
		System.out.println("++++++++++++ Testing CI CD app running +++++++++");
	}

}
