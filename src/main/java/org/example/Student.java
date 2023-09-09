package org.example;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String greetings() {
        return String.format("My name %s. I'm %d years old. I'm a student.", getName(), getAge());
    }

}
