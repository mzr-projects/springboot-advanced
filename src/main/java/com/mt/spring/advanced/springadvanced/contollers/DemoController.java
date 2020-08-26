package com.mt.spring.advanced.springadvanced.contollers;

import java.util.List;

import com.mt.spring.advanced.springadvanced.SpringAdvancedApplication;
import com.mt.spring.advanced.springadvanced.payloads.Customer;
import com.mt.spring.advanced.springadvanced.payloads.Employee;
import com.mt.spring.advanced.springadvanced.payloads.Student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/advanced-spring")
public class DemoController {

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudent(){
        return new ResponseEntity<>(SpringAdvancedApplication.students,HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployee(){
        return new ResponseEntity<>(SpringAdvancedApplication.employees,HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<>(SpringAdvancedApplication.customers,HttpStatus.OK);
    }
}