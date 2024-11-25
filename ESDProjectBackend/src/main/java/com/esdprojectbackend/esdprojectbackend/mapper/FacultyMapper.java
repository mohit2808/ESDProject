package com.esdprojectbackend.esdprojectbackend.mapper;

import com.esdprojectbackend.esdprojectbackend.dto.FacultyRegister;
import com.esdprojectbackend.esdprojectbackend.entity.Faculty;
import org.springframework.stereotype.Service;

@Service
public class FacultyMapper {
    public Faculty toFacultyEntity(FacultyRegister facultyRegister) {
        return Faculty.builder()
                .firstName(facultyRegister.firstName())
                .lastName(facultyRegister.lastName())
                .email(facultyRegister.email())
                .password(facultyRegister.password())
                .build();
    }

}
