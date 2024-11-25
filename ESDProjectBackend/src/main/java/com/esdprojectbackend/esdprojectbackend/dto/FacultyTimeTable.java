package com.esdprojectbackend.esdprojectbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FacultyTimeTable(
//        @JsonProperty("ScheduleId")
//        long scheduleId,
        @JsonProperty("time")
        String time,
        @JsonProperty("day")
        String day,
        @JsonProperty("room")
        String room,
        @JsonProperty("building")
        String building,
        @JsonProperty("course_code")
        String courseCode,
        @JsonProperty("course_name")
        String courseName
) {
}
