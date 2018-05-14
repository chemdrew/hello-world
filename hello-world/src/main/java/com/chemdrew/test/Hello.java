package com.chemdrew.test;


public class Hello {
    public String sayHello(String name) {
        if (name == null) name = "Anonymous";
        return "Hello, " + name;
    }
    
    public void untestedMethod() {
        System.out.println("test me, please!");
    }
}
