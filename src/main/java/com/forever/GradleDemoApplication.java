package com.forever;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class GradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
	}
}
