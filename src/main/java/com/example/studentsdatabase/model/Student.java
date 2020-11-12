package com.example.studentsdatabase.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    private  Long id;
    private  String firstname;
    private  String surname;
    private  String patronymic;
    private  String birthdate;
    private  String studentGroup;
}
