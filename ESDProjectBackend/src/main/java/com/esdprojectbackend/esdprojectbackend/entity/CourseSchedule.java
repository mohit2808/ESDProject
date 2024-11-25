package com.esdprojectbackend.esdprojectbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "course_schedule")
public class CourseSchedule {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Courses courseId;

    @Column(name = "time")
    private String time;

    @Column(name = "day")
    private String day;

    @Column(name = "room")
    private String room;

    @Column(name = "building")
    private String building;
}
