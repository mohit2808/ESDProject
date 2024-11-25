package com.esdprojectbackend.esdprojectbackend.repo;

import com.esdprojectbackend.esdprojectbackend.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses, Long> {
}
