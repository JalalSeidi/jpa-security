package Security.jpasecurity;

import Security.jpasecurity.model.Post;
import Security.jpasecurity.repository.postRepository;
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
	CommandLineRunner commandLineRunner(postRepository posts) {
		return args -> {
			posts.save(new Post("hello, World","hello-world","Welcome to my blog","Jalal Seidi"));
		};

	}

}
