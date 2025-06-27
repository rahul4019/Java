package com.demospring;

public class Dev {
    private Laptop laptop;

    // private int age = 8;
    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev parameterized constructor");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        // System.out.println("Working on an awesome project.");
        laptop.compile();
    }
}
