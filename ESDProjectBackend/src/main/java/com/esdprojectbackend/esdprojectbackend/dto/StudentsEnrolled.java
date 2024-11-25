package com.esdprojectbackend.esdprojectbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StudentsEnrolled(
        @JsonProperty("first_name")
        String firstName,
        @JsonProperty("last_name")
        String lastName
) {
}
