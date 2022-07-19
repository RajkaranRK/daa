package com.in28minute.collections;

import java.util.ArrayList;
import java.util.List;

import com.in28minute.model.Employee;

public class Client {
    
    public static void main(String []args) {
        List<Employee> employees = populateEmployees();
        
        
        //sorting by name and age using stream
        List<Employee> sortedEmployees = CollectionOperation.sortByNameAndAgeUsingStream(employees);
        System.out.println(sortedEmployees);
        
        //sorting by name and age using Collections class
        sortedEmployees = new ArrayList<>(employees);
        CollectionOperation.sortByNameAndAge(sortedEmployees);
        System.out.println(sortedEmployees);

        //group employee by there city
        System.out.println(CollectionOperation.groupByCity(sortedEmployees));
        
        
    }

    
    private static List<Employee> populateEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "Raj", 24,"Delhi"));
        employees.add(new Employee("2", "Karan", 25,"Mumbai"));
        employees.add(new Employee("3", "Karak", 23,"Delhi"));
        return employees;
    }
}
