package kowboj.repositories;

import kowboj.domain.Horse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorseRepository extends JpaRepository<Horse, Long> {
}