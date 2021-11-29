package me.brunosantana.builder;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
class Person3 {

    private String name;
    private String city;
    private List<String> jobs = new ArrayList<>();;

    @Builder
    public Person3(String name, String city, List<String> jobs) {
        this.name = name != null ? name : "Bruno";
        this.city = city;
        this.jobs  = jobs != null ? jobs : initializeJobs();
    }

    public static List<String> initializeJobs(){
        List<String> jobs = new ArrayList<>();
        jobs.add("Developer");
        jobs.add("Driver");
        return jobs;
    }

}

public class BuilderExample3 {

    public static void main(String[] args) {

        Person3 person = Person3.builder()
                //.name("Adam Savage")
                .city("San Francisco")
                //.jobs(Arrays.asList("Taxi Driver"))
                .build();

        System.out.println(person);

        //Person3 person2 = new Person3();
        Person3 person2 = new Person3(null, null, null);
        person2.setCity("San Andreas");
        person2.getJobs().add("Software Engineer");

        System.out.println(person2);
    }

}
