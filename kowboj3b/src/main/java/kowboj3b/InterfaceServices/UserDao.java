package kowboj3b.InterfaceServices;


import kowboj3b.domain.User;
import kowboj3b.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<User> findAll();

    User registerNewUserAccount(UserDto userDto);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    User findUserByEmail(String email);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);
}
