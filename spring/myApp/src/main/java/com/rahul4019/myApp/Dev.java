package com.rahul4019.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // field injection
    Laptop laptop;

    // * constructor injection */
    // public Dev(Laptop laptop){
    // this.laptop = laptop;
    // }

    // * setter injection */
    // @Autowired // for field and setters we have to use @Autowired annotation
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public void build() {

        laptop.compile();

        System.out.println("Working on this great project.");
    }
}
