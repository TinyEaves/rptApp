package com.boxfish.rpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@SpringBootApplication
public class RptAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RptAppApplication.class, args);
	}
}
