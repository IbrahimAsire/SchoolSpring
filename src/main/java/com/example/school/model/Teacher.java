package com.example.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class Teacher {
    @NotEmpty(message = "ID is empty!")
    @Size(min = 2, max = 9)
    private String id;
    @NotEmpty(message = "Name is empty!")
    private String name;
    @NotEmpty(message = "Course is empty!")
    private String Course;
    @NotNull(message = "Salary is empty!")
    private Double salary;

}
