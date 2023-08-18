package com.deoc.cashable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the backend!";  //remove test message and insert correct logic
    }

    // Add more methods for other API endpoints
}