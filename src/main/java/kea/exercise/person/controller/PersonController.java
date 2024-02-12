package kea.exercise.person.controller;

import kea.exercise.person.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/persons")
    public List<Person>getAllPersons(){

        var person1 = new Person();
        person1.setId(1);
        person1.setFirstName("FIRSTNAMETEST1");
        person1.setLastName("LASTNAMETEST1");
        person1.setDateOfBirth((LocalDate.parse("1970-01-01")) );

        var person2 = new Person();
        person2.setId(2);
        person2.setFirstName("FIRSTNAMETEST2");
        person2.setLastName("LASTNAMETEST2");
        person2.setDateOfBirth(LocalDate.parse("1923-05-12"));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        return persons;
    }
}
