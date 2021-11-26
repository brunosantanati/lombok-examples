package me.brunosantana.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Person {

    private String name;
    private String city;
    private String job;

}

public class BuilderExample1 {

    public static void main(String[] args) {

        Person person = Person.builder()
                .name("Adam Savage")
                .city("San Francisco")
                .job("Developer")
                .build();

        System.out.println(person);
    }

}
