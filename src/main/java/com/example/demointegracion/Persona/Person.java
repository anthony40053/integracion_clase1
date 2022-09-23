package com.example.demointegracion.Persona;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Builder
@Entity(name = "person")
@Table(
        name = "person",
        uniqueConstraints = {
                @UniqueConstraint(name = "person_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "person_email_unique", columnNames = "dni"),
        }
)
@Data
public class Person {

    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )

    @GeneratedValue
            (
                    strategy = GenerationType.SEQUENCE,
                    generator = "person_sequence"
            )
    @Id
    Long id;
    String name;
    String dni;
    String email;
    LocalDate birthDate;


}
