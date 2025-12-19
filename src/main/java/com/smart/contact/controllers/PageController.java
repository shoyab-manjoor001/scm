package com.smart.contact.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        // sending data to view
        model.addAttribute("title", "Smart Contact Manager");
        model.addAttribute("content", "This is the home page of Smart Contact Manager.");
        return "home";
    }

    // about page
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Smart Contact Manager");
        model.addAttribute("content", "This page contains information about Smart Contact Manager.");
        return "about";
    }

    // services page
    @GetMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Our Services - SCM");
        model.addAttribute("content", "Details about the services offered by Smart Contact Manager.");
        return "services";
    }
}
