package alexm.spring.boot.tdddemoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TddDemoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddDemoBootApplication.class, args);
	}
}
