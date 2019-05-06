package kowboj.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Training {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateTraining;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "horse_id")
    private Horse horse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateTraining() {
        return dateTraining;
    }

    public void setDateTraining(Date dateTraining) {
        this.dateTraining = dateTraining;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }
}
