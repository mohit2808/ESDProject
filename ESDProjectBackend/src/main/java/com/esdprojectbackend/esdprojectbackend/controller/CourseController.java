package com.esdprojectbackend.esdprojectbackend.controller;

import com.esdprojectbackend.esdprojectbackend.dto.StudentsEnrolled;
import com.esdprojectbackend.esdprojectbackend.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/course")
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/{CourseCode}/studentsenrolled")
    public List<StudentsEnrolled> getStudentsEnrolled(@PathVariable String CourseCode) {
        return courseService.findStudentsEnrolled(CourseCode);
    }
}
