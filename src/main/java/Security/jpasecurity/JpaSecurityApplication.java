package Security.jpasecurity;

import Security.jpasecurity.model.Post;
import Security.jpasecurity.model.User;
import Security.jpasecurity.repository.postRepository;
import Security.jpasecurity.repository.userRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(postRepository posts, userRepository users) {
		return args -> {
			users.save(new User("user", "password", "ROLE_USER"));
			users.save(new User("admin", "password", "ROLE_USER,ROLE_ADMIN"));
			posts.save(new Post("hello, World","hello-world","Welcome to my blog","Jalal Seidi"));
		};

	}

}
