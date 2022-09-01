package com.project.data.jpa;

import com.project.data.jpa.Data.User;
import com.project.data.jpa.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			User user1 = new User(
					"Haru",
					"Kazumoto",
					"Haru@gmail.com",
					16
			);
			userRepository.save(user1);
		};
	}
}
