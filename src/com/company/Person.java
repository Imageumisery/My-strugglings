package com.company;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private static int count = 0;

    public Person(String firstName, String lastName, int id, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        count++;
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getId(), getAge());
    }

    public static void howl () {
        System.out.println("I'm howling!!!");
    }
    public static void work () {
        System.out.println("I'm working as hell!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int changeId() {
        return id++;
    }
public static void printCount () {

        System.out.println("Number of people:" + count);
    }
}
