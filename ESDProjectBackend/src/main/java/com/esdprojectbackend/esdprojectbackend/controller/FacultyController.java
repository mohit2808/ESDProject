package com.esdprojectbackend.esdprojectbackend.controller;

import com.esdprojectbackend.esdprojectbackend.dto.FacultyLogin;
import com.esdprojectbackend.esdprojectbackend.dto.FacultyRegister;
import com.esdprojectbackend.esdprojectbackend.dto.FacultyTimeTable;
import com.esdprojectbackend.esdprojectbackend.service.FacultyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/faculty")
public class FacultyController {
    private final FacultyService facultyService;

    @PostMapping
    public ResponseEntity<String> registerFaculty(@RequestBody @Valid FacultyRegister facultyRegister) {
        return ResponseEntity.ok(facultyService.registerFaculty(facultyRegister));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginFaculty(@RequestBody @Valid FacultyLogin facultyLogin) {
        return ResponseEntity.ok(facultyService.loginFaculty(facultyLogin));
    }

    @GetMapping("/{facultyEmail}/timetable")
    public List<FacultyTimeTable> getFacultyTimetable(@PathVariable String facultyEmail) {
        return facultyService.getFacultyTimetable(facultyEmail);
    }
}
