package com.spring.guide.spring.payroll;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id){
        super("Could not find employee "+id);
    }
}
