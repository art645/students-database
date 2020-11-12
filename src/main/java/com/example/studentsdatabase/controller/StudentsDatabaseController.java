package com.example.studentsdatabase.controller;

import com.example.studentsdatabase.model.Student;
import com.example.studentsdatabase.repository.StudentsRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentsDatabaseController {
    private StudentsRepo studentsRepo;

    public StudentsDatabaseController(StudentsRepo studentsRepo) {
        this.studentsRepo = studentsRepo;
    }

    @GetMapping("/students")
    public String showAllStudents(Model model) {
        List<Student> students = new ArrayList<>();
        studentsRepo.findAll().forEach(i -> students.add(i));
        model.addAttribute("students",students);
        return  "allStudents";
    }
    @GetMapping("/createStudent")
    public String showStudentCreationForm(Student student) {
        return "createStudent";
    }
    @PostMapping("/createStudent")
    public String createStudent(Student student, Model model) {

        studentsRepo.save(student);
        model.addAttribute("users", studentsRepo.findAll());
        return "redirect:/students";
    }
    @GetMapping("/deleteStudent")
    public String showStudentDeleteForm(Student student) {
        return "deleteStudent";
    }
    @PostMapping("/deleteStudent")
    public String deleteStudent(Student student, Model model) {
        studentsRepo.deleteById(student.getId());
        return "redirect:/students";
    }

}
