package com.arjun.videocall;

import com.arjun.videocall.user.User;
import com.arjun.videocall.user.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner commandLineRunner(Service service) {
		return args -> {
			// Using constructor to create User instances
			service.register(new User("Arjun", "arjun@gmail.com", "aaa"));
			service.register(new User("John", "john@gmail.com", "aaa"));
			service.register(new User("Anny", "anna@gmail.com", "aaa"));
		};
	}

}