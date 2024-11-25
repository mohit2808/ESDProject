package com.esdprojectbackend.esdprojectbackend.repo;

import com.esdprojectbackend.esdprojectbackend.dto.FacultyTimeTable;
import com.esdprojectbackend.esdprojectbackend.entity.Faculty;
import com.esdprojectbackend.esdprojectbackend.entity.FacultyCourses;
import com.esdprojectbackend.esdprojectbackend.entity.Courses;
import com.esdprojectbackend.esdprojectbackend.entity.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FacultyRepo extends JpaRepository<Faculty, Long> {

    Optional<Faculty> findByEmail(String email);

}
