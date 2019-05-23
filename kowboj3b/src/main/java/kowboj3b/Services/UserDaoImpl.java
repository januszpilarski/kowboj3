package kowboj3b.Services;


import kowboj3b.InterfaceServices.UserDao;
import kowboj3b.domain.User;
import kowboj3b.dto.UserDto;
import kowboj3b.repositories.PrivilegeRepository;
import kowboj3b.repositories.RoleRepository;
import kowboj3b.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User registerNewUserAccount(final UserDto userDto) {

        final User user = new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));

        return userRepository.save(user);
    }

    @Override
    public void saveRegisteredUser(User user) {

    }

    @Override
    public void deleteUser(final User user) {

        userRepository.delete(user);
    }

    @Override
    public User findUserByEmail(final String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> getUserByID(final long id) {
        return userRepository.findById(id);
    }

    @Override
    public void changeUserPassword(User user, String password) {

    }

    @Override
    public boolean checkIfValidOldPassword(User user, String password) {
        return false;
    }
}
