package com.rahul4019.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class Laptop implements Computer{
    public void compile() {
        System.out.println("Compiling on laptop");
    }
}
