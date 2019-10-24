package com.webb.idea.bug;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloTestJava {
    
    private Hello sut;
    
    @Before
    public void setup() {
        sut = new Hello();
    }

    @Test
    public void testSayHello_NameNull() throws Exception {
        //arrange
        String name = null;

        //act
        String result = sut.sayHello(name);

        //verify
        Assert.assertEquals("Hello, World", result);
    }

    @Test
    public void testSayHello_NameChamp() throws Exception {
        //arrange
        String name = "Champ";

        //act
        String result = sut.sayHello(name);

        //verify
        Assert.assertEquals("Hello, Champ", result);
    }
}
