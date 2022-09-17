package spring.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
//public class App implements CommandLineRunner
public class App{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}
	
//	@Autowired
//	Us
//	@Override
//	public void run(String... args) throws Exception {
//		
//		
//	}

}
