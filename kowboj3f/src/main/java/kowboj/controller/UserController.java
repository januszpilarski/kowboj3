package kowboj.controller;




import kowboj.Services.UserDaoImpl;
import kowboj.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL = "/api/v1/users";


    private final UserDaoImpl userDAO;

    public UserController(UserDaoImpl userDAO) {
        this.userDAO = userDAO;
    }

//    List<User> getAllUsers(){
//        return userDAO.getAll();
//    }
}
