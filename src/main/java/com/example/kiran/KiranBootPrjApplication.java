package com.example.kiran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class KiranBootPrjApplication extends SpringBootServletInitializer {

	/**
	 *  Used when run as jar (packaging in the pom.xml)
	 */
	public static void main(String[] args) {
		SpringApplication.run(KiranBootPrjApplication.class, args);
	}

	/**
	 *  Used when run as war (packaging in the pom.xml)
	 */
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(KiranBootPrjApplication.class);
//	}
	
	
}
