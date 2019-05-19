package kowboj.bootstrap;

import kowboj.domain.Role;
import kowboj.domain.Training;
import kowboj.domain.User;
import kowboj.repositories.RoleRepository;
import kowboj.repositories.TrainingRepository;
import kowboj.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.*;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final TrainingRepository trainingRepository;

    public BootStrapData(UserRepository userRepository, RoleRepository roleRepository, TrainingRepository trainingRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.trainingRepository = trainingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Role role = new Role();
        role.setName("su");

        roleRepository.save(role);

        Training training1 = new Training();
        training1.setDateTraining(Date.from(Instant.now()));


        User u1 = new User();
        u1.setFirstName("Adam");
        u1.setLastName("Nowak");
        u1.setEmail("mailu1@mail.pl");
        u1.setPassword("haslo1");
        u1.setWeight(80);
        u1.setEnabled(true);
        u1.setTokenExpired(false);
        u1.setRoles(List.of(role));
        u1.setTrainings(List.of(training1));
        training1.setUser(u1);

        trainingRepository.save(training1);
        userRepository.save(u1);

        User u2 = new User();
        u2.setFirstName("Basia");
        u2.setLastName("Zalewska");
        u2.setEmail("mailu2@mail.pl");
        u2.setPassword("haslo2");
        u2.setWeight(60);
        u2.setEnabled(true);
        u2.setTokenExpired(false);
        u2.setRoles(List.of(role));

        userRepository.save(u2);

        User u3 = new User();
        u3.setFirstName("Edward");
        u3.setLastName("Bocian");
        u3.setEmail("dingo5017@gmail.com");
        u3.setPassword("haslo3");
        u3.setWeight(90);
        u3.setEnabled(true);
        u3.setTokenExpired(false);
        u3.setRoles(List.of(role));

        userRepository.save(u3);

        System.out.println("Users:" + userRepository.count());
    }
}
