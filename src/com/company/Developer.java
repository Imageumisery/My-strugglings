package com.company;

public class Developer extends Person {
    public Developer(String firstName, String lastName, int id, int age) {
        super(firstName, lastName, id, age);
    }

    public void develop (String task) {
        System.out.println("I'm developing!");
    }

    @Override
    public int changeId() {
        return getId() + 2;
    }
}
