package Maziwa.First_Project_Java_Spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "greeting"; // loads greeting.html
    }
}
