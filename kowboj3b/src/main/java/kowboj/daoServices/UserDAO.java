package kowboj.daoServices;


import kowboj.domain.User;

import java.util.List;

public interface UserDAO {

    User findUserById(Long id);

    List<User> getAll();
}
