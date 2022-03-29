package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class Student {
    @NotEmpty(message = "ID is empty!")
    @Size(min = 2, max = 10)
    private String id;
    @NotEmpty(message = "ID is empty!")
    private String name;
    @NotEmpty(message = "ID is empty!")
    private String level;
}
