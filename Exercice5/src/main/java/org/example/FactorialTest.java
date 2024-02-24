package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Factorial.factorial;
public class FactorialTest {
    @Test
    void NegatifNumberThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->factorial(-5));
    }
    @Test
    void PositifNumberFactorial(){
        Assertions.assertEquals(24,factorial(4));
    }
    @Test
    void FactorialOfNumberZero(){
        Assertions.assertEquals(1,factorial(0));
    }
    @Test
    void FactorialOfNumberOne(){
        Assertions.assertEquals(1,factorial(1));
    }
}
