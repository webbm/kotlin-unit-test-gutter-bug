package com.webb.idea.bug

class Hello {
    
    fun sayHello(name: String?): String {
        return "Hello, ${name ?: "World"}"
    }
    
}

