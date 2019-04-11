package kowboj.daoServicesImpl;


import kowboj.daoServices.Dao;
import kowboj.domain.User;
import kowboj.repositories.UserRepository;


import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements Dao<User> {

    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getById(long id) {
        return Optional.of(userRepository.getOne(id));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(User user) {

    }
}
