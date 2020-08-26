package com.mt.spring.advanced.springadvanced.payloads;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
        
    @JsonSerialize(using = MySerializer.class)
    private int amount;
}