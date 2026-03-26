package com.example.task_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")  // maps exactly to root
    public String home() {
        return "Task Manager API is running!";
    }
}