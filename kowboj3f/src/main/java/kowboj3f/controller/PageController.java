package kowboj3f.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
public class PageController {

    @GetMapping("/")
    public String welcome() {
        return "landing";
    }
}
