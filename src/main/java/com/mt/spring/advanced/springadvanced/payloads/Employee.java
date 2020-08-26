package com.mt.spring.advanced.springadvanced.payloads;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.mt.spring.advanced.springadvanced.configs.JsonConfigs.SecretView;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @JsonUnwrapped
    private Person person;

    @JsonUnwrapped
    private Address address;

    @JsonView(SecretView.class)
    private boolean employed;

}