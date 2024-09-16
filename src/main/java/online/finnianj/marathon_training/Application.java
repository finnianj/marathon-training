package online.finnianj.marathon_training;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import online.finnianj.marathon_training.run.Location;
import online.finnianj.marathon_training.run.Run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// @Bean
	// CommandLineRunner runner() {
	// 	return args -> {
	// 		Run run = new Run(
	// 			1,
	// 			"First Run",
	// 			LocalDateTime.now(),
	// 			LocalDateTime.now().plus(1, ChronoUnit.HOURS),
	// 			3,
	// 			Location.OUTDOOR
	// 		);
	// 		log.info("Run: " + run);
	// 	};
	// }

}
