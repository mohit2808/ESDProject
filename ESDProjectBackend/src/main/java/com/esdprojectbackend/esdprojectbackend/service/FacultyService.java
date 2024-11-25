package com.esdprojectbackend.esdprojectbackend.service;

import com.esdprojectbackend.esdprojectbackend.dto.FacultyRegister;
import com.esdprojectbackend.esdprojectbackend.dto.FacultyLogin;
import com.esdprojectbackend.esdprojectbackend.dto.FacultyTimeTable;
import com.esdprojectbackend.esdprojectbackend.entity.Faculty;
import com.esdprojectbackend.esdprojectbackend.helper.EncryptionService;
import com.esdprojectbackend.esdprojectbackend.helper.JWTHelper;
import com.esdprojectbackend.esdprojectbackend.mapper.FacultyMapper;
import com.esdprojectbackend.esdprojectbackend.repo.CourseScheduleRepo;
import com.esdprojectbackend.esdprojectbackend.repo.FacultyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FacultyService {

    private final FacultyMapper facultyMapper;
    private final FacultyRepo facultyRepo;
    private final CourseScheduleRepo courseScheduleRepo;
    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;

    public String registerFaculty(FacultyRegister facultyRegister) {
        Faculty faculty = facultyMapper.toFacultyEntity(facultyRegister);
        faculty.setPassword(encryptionService.encode(faculty.getPassword()));
        facultyRepo.save(faculty);
        return "Faculty registered successfully";
    }

    public Faculty getFaculty(String email) {
        return facultyRepo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Faculty not found"));
    }
    public String loginFaculty(FacultyLogin facultyLogin) {
        Faculty faculty = getFaculty(facultyLogin.email());
        if(!encryptionService.validates(facultyLogin.password(), faculty.getPassword())) {
            return "Wrong Password or Email";
        }

        return jwtHelper.generateToken(facultyLogin.email());
    }

    public List<FacultyTimeTable> getFacultyTimetable(String facultyEmail) {
        return courseScheduleRepo.getFacultyTimeTable(facultyEmail);
    }

}
