package com.mt.spring.advanced.springadvanced.payloads;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    
    private String name;
    private int age;
    private int birthDate;

    @JsonUnwrapped
    private Salary salary;
}