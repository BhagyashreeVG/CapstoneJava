package com.wecare;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@ConfigurationProperties
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.wecare.feignclients")
@ComponentScan({"com.wecare.api", "com.wecare.service"})
@EntityScan("com.wecare.entity")
@EnableJpaRepositories("com.wecare.repository")
public class AppointmentServiceApplication {
	
	@Value("${user.service.url}")
	private String userServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(AppointmentServiceApplication.class, args);
	}
	
	@Bean 
	  public WebClient webClient () { 
		  WebClient webClient =WebClient.builder()
				  .baseUrl(userServiceUrl).build();
	  
	  return webClient; }

}
