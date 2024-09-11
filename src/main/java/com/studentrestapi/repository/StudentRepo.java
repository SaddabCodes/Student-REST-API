package com.studentrestapi.repository;

import com.studentrestapi.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
}
