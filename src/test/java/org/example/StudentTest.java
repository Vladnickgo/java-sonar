package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void greetingTest() {
        String expected="My name Gena. I'm 50 years old. I'm a student.";
        Person person = new Student("Gena", 50);
        assertEquals(expected, person.greetings());
    }
}