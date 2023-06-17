package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        // default constructor
    }
    public Person(Person otherPerson) {
        // copy constructor
        this.firstName = otherPerson.firstName;
        this.lastName = otherPerson.lastName;
        this.age = otherPerson.age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
