package edu.mum.cs.cs425.eregistrar.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @NotNull
    private Long studentNumber;
    @NotEmpty
    private String firstName;


    private String middleName;

    @NotEmpty
    private String lastName;

    private float cgpa;

    @NotNull
    private LocalDate enrollmentDate;

    @NotNull
    private Boolean isInternational;



}
