package com.esdprojectbackend.esdprojectbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "course_code", nullable = false, unique = true)
    private String courseCode;

    @Column(name = "name")
    private String courseName;

    @OneToMany(mappedBy = "courseId")
    private Set<CourseSchedule> courseSchedule;

    @OneToMany(mappedBy = "course_id")
    private Set<FacultyCourses> courseFaculty;

    @OneToMany(mappedBy = "course_id")
    private Set<StudentCourses> courseStudents;
}
