package org.example;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public String greetings() {
        return String.format("My name %s. I'm %d years old. I'm a teacher.", getName(), getAge());
    }
}
