package online.finnianj.marathon_training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import online.finnianj.marathon_training.user.User;
import online.finnianj.marathon_training.user.UserRestClient;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRestClient client) {
		return args -> {
			// List<User> users = client.findAll();
			// System.out.println("Users: " + users);

			User user = client.findById(1);
			System.out.println("User: " + user);
		};
	}

}
