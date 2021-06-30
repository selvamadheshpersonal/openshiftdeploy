package com.nseit.openshift.openshif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshifApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to OpenShift";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Welcome to OpenShift "+input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshifApplication.class, args);
	}

}
