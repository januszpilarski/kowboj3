package kowboj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(kowboj.domain.User.class)

@SpringBootApplication
public class Kowboj3fApplication {

    public static void main(String[] args) {
        SpringApplication.run(Kowboj3fApplication.class, args);
    }

}
