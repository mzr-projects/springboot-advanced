package com.mt.spring.advanced.springadvanced;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mt.spring.advanced.springadvanced.payloads.Employee;
import com.mt.spring.advanced.springadvanced.payloads.Person;
import com.mt.spring.advanced.springadvanced.payloads.Salary;
import com.mt.spring.advanced.springadvanced.payloads.Student;
import com.mt.spring.advanced.springadvanced.payloads.Address;
import com.mt.spring.advanced.springadvanced.payloads.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdvancedApplication {

	public static List<Employee> employees = new ArrayList<>();
	public static List<Student> students = new ArrayList<>();
	public static List<Customer> customers = new ArrayList<>();
	
	static {
		employees.add(new Employee(new Person("MT",23,Calendar.DAY_OF_MONTH,new Salary(2000)),new Address("124234FE","New York"),false));
		employees.add(new Employee(new Person("NT",67,Calendar.DAY_OF_MONTH,new Salary(3500)),new Address("45345gg","Dallas"),true));
		employees.add(new Employee(new Person("GT",54,Calendar.DAY_OF_MONTH,new Salary(6000)),new Address("34543645","Sacramento"),false));

		students.add(new Student(new Person("Jimmy",6,Calendar.DAY_OF_MONTH,new Salary(1000)),new Address("124234FE","New York"),1));
		students.add(new Student(new Person("Jinny",12,Calendar.DAY_OF_MONTH,new Salary(1500)),new Address("124234FE","New York"),6));
		students.add(new Student(new Person("Matt",9,Calendar.DAY_OF_MONTH,new Salary(1200)),new Address("124234FE","New York"),5));

		customers.add(new Customer("MT","124234FE","New"));
		customers.add(new Customer("NT","35432453g","Denver"));
		customers.add(new Customer("GT","4536456g","Dallas"));
	}

	public static List<?> getData(String type){
		if(type.equalsIgnoreCase("student")){
			return students;
		}else if(type.equalsIgnoreCase("employee")){
			return employees;
		}else{
			return customers;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAdvancedApplication.class, args);
	}

}
