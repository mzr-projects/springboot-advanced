package com.mt.spring.advanced.springadvanced.payloads;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MySerializer extends JsonSerializer<Integer> {

    @Override
    public void serialize(Integer arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
        // TODO Auto-generated method stub
        arg1.writeString(arg0.toString() + " $");
    }   

}
