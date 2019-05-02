package kowboj.controller;

import kowboj.domain.User;
import kowboj.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import kowboj.Services.UserDaoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private UserDaoImpl userService;

    @GetMapping("/users")
    public ResponseEntity <List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

}
