package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void Personisadult(){
        Person person = new Person("Belouahem", "Oussama", 18);
        Boolean adult = person.isAdult();
        Assertions.assertTrue(adult);
    }
    @Test
    public void PersonNotAdult(){
        Person person = new Person("Belouahem", "Oussama", 17);
        Boolean adult = person.isAdult();
        Assertions.assertFalse(adult);
    }
    @Test
    public void GetfullnameTest(){
        Person person = new Person("Belouahem", "Oussama", 23);
        String fullname = person.getFullName();
        Assertions.assertEquals("Belouahem Oussama", fullname);
    }
}
