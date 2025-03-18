package com.makeLog.makeLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MakeLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeLogApplication.class, args);
	}
}
