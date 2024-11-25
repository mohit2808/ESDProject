package com.esdprojectbackend.esdprojectbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "student_courses")
public class StudentCourses {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Students student_id;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Courses course_id;
}
