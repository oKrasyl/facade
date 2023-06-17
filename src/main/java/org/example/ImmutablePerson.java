package org.example;

public final class ImmutablePerson {
    private ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }


    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static ImmutablePerson create(String name, int age){
        return new ImmutablePerson(name, age);
    }


}
