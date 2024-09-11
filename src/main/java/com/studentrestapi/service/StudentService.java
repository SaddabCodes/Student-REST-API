package com.studentrestapi.service;

import com.studentrestapi.entity.StudentEntity;
import com.studentrestapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepo.save(studentEntity);
    }

    public List<StudentEntity> getStudent() {
        return studentRepo.findAll();
    }

    public void delete(Long studentId) {
        studentRepo.deleteById(studentId);
    }

    public StudentEntity updateStudent(Long studentId, StudentEntity studentDetails) {
        Optional<StudentEntity> optionalStudent = studentRepo.findById(studentId);

        if (optionalStudent.isPresent()) {
            StudentEntity existStudent = optionalStudent.get();
            existStudent.setFirstName(studentDetails.getFirstName());
            existStudent.setLastName(studentDetails.getLastName());
            existStudent.setDepartment(studentDetails.getDepartment());
            existStudent.setSemester(studentDetails.getSemester());
            return studentRepo.save(existStudent);

        } else {
            throw new RuntimeException("Student not found with id: " + studentId);

        }

    }
}
