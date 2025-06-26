package com.rahul4019.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		// this creates a spring container(IoC container) and returns its context
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
