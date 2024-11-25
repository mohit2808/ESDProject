package com.esdprojectbackend.esdprojectbackend.service;

import com.esdprojectbackend.esdprojectbackend.dto.StudentsEnrolled;
import com.esdprojectbackend.esdprojectbackend.repo.StudentsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final StudentsRepo studentsRepo;

    public List<StudentsEnrolled> findStudentsEnrolled(String courseCode){
        return studentsRepo.findStudentsByCourseCode(courseCode);
    }
}
