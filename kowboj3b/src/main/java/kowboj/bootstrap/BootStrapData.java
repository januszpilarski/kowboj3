package kowboj.bootstrap;

import kowboj.domain.User;
import kowboj.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepository userRepository;

    public BootStrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User();
        u1.setFirstName("Adam");
        u1.setLastName("Nowak");
        u1.setEmail("mailu1@mail.pl");
        u1.setPassword("haslo1");
        u1.setWeight(80);
        u1.setEnabled(true);
        u1.setTokenExpired(false);

        userRepository.save(u1);

        User u2 = new User();
        u2.setFirstName("Basia");
        u2.setLastName("Zalewska");
        u2.setEmail("mailu2@mail.pl");
        u2.setPassword("haslo2");
        u2.setWeight(60);
        u2.setEnabled(true);
        u2.setTokenExpired(false);

        userRepository.save(u2);

        User u3 = new User();
        u3.setFirstName("Edward");
        u3.setLastName("Bocian");
        u3.setEmail("dingo5017@gmail.com");
        u3.setPassword("haslo3");
        u3.setWeight(90);
        u3.setEnabled(true);
        u3.setTokenExpired(false);

        userRepository.save(u3);

        System.out.println("Users:" + userRepository.count());
    }
}
