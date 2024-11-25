package com.esdprojectbackend.esdprojectbackend.repo;

import com.esdprojectbackend.esdprojectbackend.entity.StudentCourses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCoursesRepo extends JpaRepository<StudentCourses, Long> {
}
