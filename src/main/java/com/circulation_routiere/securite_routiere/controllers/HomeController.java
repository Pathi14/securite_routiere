package com.circulation_routiere.securite_routiere.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(ModelMap modelMap) {
        String Friends[] = {"Alice", "Bob", "John"};
        modelMap.addAttribute("friends", Friends);
        return "home";
    }
}
