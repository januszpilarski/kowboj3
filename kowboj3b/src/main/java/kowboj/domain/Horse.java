package kowboj.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Horse {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "horse")
    private Collection<Training> trainings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(Collection<Training> trainings) {
        this.trainings = trainings;
    }
}
