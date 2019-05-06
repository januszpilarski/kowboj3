package kowboj.repositories;

import kowboj.domain.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {
}
