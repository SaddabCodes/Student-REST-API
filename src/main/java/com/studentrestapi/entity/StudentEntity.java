    package com.studentrestapi.entity;

    import jakarta.persistence.*;
    import lombok.Data;

    @Entity
    @Data
    @Table(name = "student_info")
    public class StudentEntity {

        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private String department;
        private String semester;

    }
