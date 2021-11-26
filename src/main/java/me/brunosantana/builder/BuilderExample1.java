package me.brunosantana.builder;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Person {

    private String name;
    private String city;
    @Singular
    private List<String> jobs;

}

public class BuilderExample1 {

    public static void main(String[] args) {

        Person person = Person.builder()
                .name("Adam Savage")
                .city("San Francisco")
                .job("Developer")
                .job("Driver")
                .build();

        System.out.println(person);
    }

}
