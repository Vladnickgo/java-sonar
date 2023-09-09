package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Teacher("Gena", 40);
        Person person2 = new Student("Roma", 20);
        System.out.println(person1.greetings());
        System.out.println(person2.greetings());
    }
}