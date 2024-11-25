package com.esdprojectbackend.esdprojectbackend.repo;

import com.esdprojectbackend.esdprojectbackend.dto.FacultyTimeTable;
import com.esdprojectbackend.esdprojectbackend.entity.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseScheduleRepo extends JpaRepository<CourseSchedule, Long> {
    @Query("SELECT new com.esdprojectbackend.esdprojectbackend.dto.FacultyTimeTable(cs.time, cs.day, cs.room, cs.building, c.courseCode, c.courseName) " +
            "FROM Faculty f " +
            "JOIN f.facultyCourses fc " +
            "JOIN fc.course_id c " +
            "JOIN c.courseSchedule cs " +
            "WHERE f.email = :facultyEmail")
    List<FacultyTimeTable> getFacultyTimeTable(@Param("facultyEmail") String facultyEmail);
}
