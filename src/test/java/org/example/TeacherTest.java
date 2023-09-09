package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void greetingsTest() {
        String expected = "My name Vasiliy. I'm 30 years old. I'm a teacher.";
        Person person = new Teacher("Vasiliy", 30);
        assertEquals(expected, person.greetings());
    }
}