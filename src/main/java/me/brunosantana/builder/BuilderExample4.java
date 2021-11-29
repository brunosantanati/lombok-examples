package me.brunosantana.builder;

import lombok.Builder;
import lombok.Value;

import java.util.Arrays;
import java.util.List;

//example based on: https://www.baeldung.com/lombok-builder

@Value
class Person4 { //it represents an immutable entity

    private String name;
    private String city;
    private List<String> jobs;

}

class PersonBuilder{

    @Builder(builderMethodName = "builder")
    public static Person4 newPerson(String name, String city, List<String> jobs){
        return new Person4(name, city, jobs);
    }
}

public class BuilderExample4 {

    public static void main(String[] args) {

        Person4 person = PersonBuilder.builder()
                .name("Adam Savage")
                .city("San Francisco")
                .jobs(Arrays.asList("Taxi Driver"))
                .build();

        System.out.println(person);
    }

}
