package me.brunosantana.builder;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Person2 {

    @Builder.Default private String name = "Bruno";
    private String city;
    //@Singular
    @Builder.Default private List<String> jobs = initializeJobs(); //@Builder.Default and @Singular cannot be mixed.

    public static List<String> initializeJobs(){
        List<String> jobs = new ArrayList<>();
        jobs.add("Developer");
        jobs.add("Driver");
        return jobs;
    }

}

public class BuilderExample2 {

    public static void main(String[] args) {

        Person2 person = Person2.builder()
                //.name("Adam Savage")
                .city("San Francisco")
                //.jobs(Arrays.asList("Taxi Driver"))
                .build();

        System.out.println(person);

        Person2 person2 = new Person2();
        person2.setCity("San Andreas");
        person2.getJobs().add("Software Engineer");

        System.out.println(person2);
    }

}
