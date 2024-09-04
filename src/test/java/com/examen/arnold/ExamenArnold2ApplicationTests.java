package com.examen.arnold;

import java.net.http.HttpHeaders;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class ExamenArnold2ApplicationTests {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public HttpHeaders httpHeaders() {
		return new HttpHeaders();
	}
	
	

	@Test
	void contextLoads() {
	}

}
