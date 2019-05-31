package kowboj3f.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RequestMapping("/home")
@Controller
public class PageController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @GetMapping("/home")
    public String home(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "home";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }
}
