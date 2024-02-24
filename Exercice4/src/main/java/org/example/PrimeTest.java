package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Prime.isPrime;
public class PrimeTest {
    @Test
    void NumberIsNotPrimeInferiorAt2(){
        Assertions.assertFalse(isPrime(1));
        Assertions.assertFalse(isPrime(-6));
    }
    @Test
    void NumberIsNotPrimeSuperiorAt2(){
        Assertions.assertFalse(isPrime(6));
    }
    @Test
    void NumberIskPrimerSuperiorAt3(){
        Assertions.assertTrue(isPrime(7));
    }
    @Test
    void NUmberIsEquals2(){
        Assertions.assertTrue(isPrime(2));
    }
    @Test
    void NUmberIsEquals3(){
        Assertions.assertTrue(isPrime(3));
    }
}
