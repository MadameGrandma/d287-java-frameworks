package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AboutUsController {

    @GetMapping("/about")
    public String showAboutUs() {
        return "about";
    }

}