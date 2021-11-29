package me.brunosantana.builder;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Person {

    @Builder.Default private String name = "Bruno";
    private String city;
    @Singular
    private List<String> jobs = new ArrayList<>();

}

public class BuilderExample1 {

    public static void main(String[] args) {

        Person person = Person.builder()
                //.name("Adam Savage")
                .city("San Francisco")
                .job("Developer")
                .job("Driver")
                .build();

        System.out.println(person);

        Person person2 = new Person();
        person2.setCity("San Andreas");
        person2.getJobs().add("Software Engineer");

        System.out.println(person2);
    }

}
