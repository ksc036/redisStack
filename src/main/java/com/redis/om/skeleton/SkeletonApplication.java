package com.redis.om.skeleton;

import com.redis.om.skeleton.models.User;
import com.redis.om.skeleton.repository.UserRepository;
import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@EnableRedisDocumentRepositories(basePackages = "com.redis.om.skeleton.*")
//@EnableRedisDocumentRepositories(basePackages = "com.redis.om.documents.*")
//@EnableSwagger2
@SpringBootApplication
@Configuration
//@Slf4j
public class SkeletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
//	}

//	@Bean
//	CommandLineRunner loadTestData(UserRepository repo) {
//		return args -> {
//			repo.deleteAll();
//
//			String thorSays = "The Rabbit Is Correct, And Clearly The Smartest One Among You.";
//
//
//			User user = User.of(3,"ksc");
////			log.info("User 출력확인 ***************** {}",user);
//			repo.save(user);
//		};
//	}
}
