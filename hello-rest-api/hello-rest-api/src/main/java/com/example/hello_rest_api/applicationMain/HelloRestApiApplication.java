package com.example.hello_rest_api.applicationMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestApiApplication.class, args);
	}

}
 // curl "http://localhost:8080/hello/query?name=Mark" -w "\n"
// curl "http://localhost:8080/hello/param/Mark" -w "\n"