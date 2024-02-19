package com.oc.buddytest.test;

import com.oc.buddytest.test.service.MockDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	@Autowired
	MockDBService mockDBService;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
