package kowboj.InterfaceServices;


import kowboj.domain.User;
import kowboj.dto.UserDto;

import java.util.Optional;

public interface UserDao {

    User registerNewUserAccount(UserDto userDto);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    User findUserByEmail(String email);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);
}
