package com.example.studentsdatabase.repository;

import com.example.studentsdatabase.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends CrudRepository<Student,Long> {
}
