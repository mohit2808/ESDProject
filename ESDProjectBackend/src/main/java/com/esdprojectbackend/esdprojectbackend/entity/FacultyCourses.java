package com.esdprojectbackend.esdprojectbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "faculty_courses")
public class FacultyCourses {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty_id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course_id;
}
