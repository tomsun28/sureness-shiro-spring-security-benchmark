package com.usthe.performance.surenessdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author tomsun28
 */
@SpringBootApplication
@ServletComponentScan
public class SurenessDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurenessDemoApplication.class, args);
	}

}
