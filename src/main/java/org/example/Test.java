package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

    interface In {
        String generate();

        default void print(String value) {
            System.out.println(Optional.ofNullable(value).orElseGet(this::generate));
        }
    }
    public static void main(String[] args) {

        ((In) new In() {
            public String generate(){
            return "Hello!";}
        })
                .print(null);

        Nullable nullable = null;
        System.out.println(nullable.hello());

    List list = new ArrayList<>();

    list.add("One");
    list.add("Two");
    list.add("Three");

    list.stream().forEach(s ->

    {
        System.out.println(s);

    });


    String[] names = {"Java", "Kotlin", "Java"};
    String name = "Java";
    Predicate predicate = name::equals;
        System.out.println(Stream.of(names).filter(predicate).count());
    name = "Kotlin";
        System.out.println(Stream.of(names).filter(predicate).count());


    }
}
