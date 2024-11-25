package com.esdprojectbackend.esdprojectbackend.repo;

import com.esdprojectbackend.esdprojectbackend.dto.StudentsEnrolled;
import com.esdprojectbackend.esdprojectbackend.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepo extends JpaRepository<Students, Integer> {
    @Query("SELECT new com.esdprojectbackend.esdprojectbackend.dto.StudentsEnrolled(s.firstName, s.lastName) " +
            "FROM Students s " +
            "JOIN s.studentCourses sc " +
            "JOIN sc.course_id c " +
            "WHERE c.courseCode = :courseCode")
    List<StudentsEnrolled> findStudentsByCourseCode(@Param("courseCode") String courseCode);
}
