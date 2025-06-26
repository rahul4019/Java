package com.rahul4019.FirstSpringApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String Greet() {
        return "Hello World, Welcome to Spring!";
    }
}
