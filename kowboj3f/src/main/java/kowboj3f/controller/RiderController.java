package kowboj3f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class RiderController {

    @GetMapping("/riders")
    public String home(ModelMap model) {
        model.put("time", new Date());
        return "home";
    }
}
