package com.example.studentsdatabase.repository;

import com.example.studentsdatabase.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends CrudRepository<Student,Long> {
    @Query(value = "select max(s.id) from students s",nativeQuery = true)
    Long findMaxId();
}
