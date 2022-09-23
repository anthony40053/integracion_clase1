package com.example.demointegracion.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Person> getAllPersona()
    {

        LocalDate date = LocalDate.of(1992, Month.SEPTEMBER,5);

        Person person = Person.builder()
                .id(1L)
                .dni("75928157")
                .email("gustavo@hotmail.com")
                .name("ggustavo")
                .birthDate(date)
                .build();


        return List.of(person);
    }


    @GetMapping
    @RequestMapping("/getid")
    public Person getById()
    {

        LocalDate date = LocalDate.of(1992, Month.SEPTEMBER,5);

        Person person = Person.builder()
                .id(1L)
                .dni("75928157")
                .email("gustavo@hotmail.com")
                .name("ggustavo")
                .birthDate(date)
                .build();


        return person;
    }

    //put

    //post

    //delete
}
