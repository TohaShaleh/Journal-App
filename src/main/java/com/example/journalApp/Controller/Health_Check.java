package com.example.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// For every SpringBoot application we need to create a health-check controller class ..

@RestController    // It marks this class as Spring MVC that will handle web or HTTP requests and return data directly as JSON
public class Health_Check {

    @GetMapping("/health-Check")
    public String healthCheck()
    {
        return "Ok";
    }
}
