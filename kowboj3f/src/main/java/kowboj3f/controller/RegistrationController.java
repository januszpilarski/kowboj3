package kowboj3f.controller;

import kowboj3b.Services.UserDaoImpl;
import kowboj3b.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private UserDaoImpl userService;

    @GetMapping("/users")
    public ResponseEntity <List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }

}
