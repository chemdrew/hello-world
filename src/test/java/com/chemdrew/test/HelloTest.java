package com.chemdrew.test;

import org.junit.Assert;
import org.junit.Test;


public class HelloTest {

    private Hello hello = new Hello();

    @Test
    public void sayHelloAndrew() {
        String greeting = hello.sayHello("Andrew");
        Assert.assertEquals(greeting, "Hello, Andrew");
    }

    @Test
    public void sayHelloAnonymous() {
        String greeting = hello.sayHello(null);
        Assert.assertEquals(greeting, "Hello, Anonymous");
    }
}
