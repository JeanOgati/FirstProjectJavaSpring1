package Maziwa.First_Project_Java_Spring.controller;

// Make sure this matches your project package structure

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // <-- CRITICAL: Must be @Controller, NOT @RestController!
public class HelloController {

    @GetMapping("/greeting") // <-- Maps your web browser URL path
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting"; // <-- CRITICAL: Must match the exact name of your greeting.html file!
    }
}