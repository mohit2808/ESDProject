package com.esdprojectbackend.esdprojectbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record FacultyLogin(
        @NotEmpty(message = "Email should be given")
        @NotNull(message = "Email should be given")
        @NotBlank(message = "Email should be given")
        @JsonProperty("email")
        String email,

        @NotEmpty(message = "Email should be given")
        @NotNull(message = "Email should be given")
        @NotBlank(message = "Email should be given")
        @JsonProperty("password")
        String password
) {
}
