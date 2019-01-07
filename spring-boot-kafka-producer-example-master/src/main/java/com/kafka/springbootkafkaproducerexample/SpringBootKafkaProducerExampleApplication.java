package com.kafka.springbootkafkaproducerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Saubhagya.Pradhan2
 * This is the entry point class for kafka producer application 
 */
@SpringBootApplication
public class SpringBootKafkaProducerExampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootKafkaProducerExampleApplication.class);
	}
}
