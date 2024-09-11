package com.studentrestapi.controller;

import com.studentrestapi.entity.StudentEntity;
import com.studentrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.addStudent(studentEntity);
    }

    @GetMapping("/get")
    public List<StudentEntity> getStudent() {
        return studentService.getStudent();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long studentId) {
        studentService.delete(studentId);
        return "user delete successfully";
    }

    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(@PathVariable("id") Long studentId, @RequestBody StudentEntity studentDetails) {
        return studentService.updateStudent(studentId, studentDetails);
    }
}
