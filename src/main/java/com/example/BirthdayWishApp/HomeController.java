package com.example.BirthdayWishApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {





    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/wish")
    public String wish(Model model) {

        model.addAttribute("name", "Dear Sonila");
        model.addAttribute("message", "May your special day be filled with love, joy, and all the beautiful moments you truly deserve. You bring positivity wherever you go—may the year ahead bring you even more happiness and success. \uD83D\uDC96✨");
        model.addAttribute("photo", "/birthday.jpg");

        return "wish";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
