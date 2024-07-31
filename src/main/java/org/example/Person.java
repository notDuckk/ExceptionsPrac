package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        } else if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name must be between 0 and 40 characters");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
