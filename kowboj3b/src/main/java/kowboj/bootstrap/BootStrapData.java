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

        User u1 = new User("Adam", "Nowak", "mailu1@mail.pl", "haslo1", 80, enabled, tokenExpired);
        userRepository.save(u1);

        User u2 = new User("Basia", "Zalewska", "mailu1@mail.pl", "haslo2", 70, enabled, tokenExpired);
        userRepository.save(u2);

        User u3 = new User("Edward", "Bocian", "dingo5017@gmail.com", "haslo3", 90, enabled, tokenExpired);
        userRepository.save(u3);

        System.out.println("Users:" + userRepository.count());
    }
}
