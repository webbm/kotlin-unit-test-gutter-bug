package com.webb.idea.bug

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HelloTest {
    
    private lateinit var sut: Hello
    
    @Before
    fun setup() {
        sut = Hello()
    }

    @Test
    fun testSayHello_NameNull() {
        //arrange
        val name: String? = null

        //act
        val result = sut.sayHello(name)

        //verify
        assertEquals("Hello, World", result)
    }

    @Test
    fun `test sayHello - Name null`() {
        //arrange
        val name: String? = null

        //act
        val result = sut.sayHello(name)

        //verify
        assertEquals("Hello, World", result)
    }

    @Test
    fun testSayHello_NameChamp() {
        //arrange
        val name = "Champ"

        //act
        val result = sut.sayHello(name)

        //verify
        assertEquals("Hello, Champ", result)
    }

    @Test
    fun `test sayHello - Name Champ`() {
        //arrange
        val name = "Champ"

        //act
        val result = sut.sayHello(name)

        //verify
        assertEquals("Hello, Champ", result)
    }

}
    
