package com.sns.waloapiservices;

import com.sns.waloapiservices.utils.TokenValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WaloApiServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(WaloApiServicesApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	@Bean
	public TokenValidator getTokenValidator(){
		return TokenValidator.getInstance();
	}

}
