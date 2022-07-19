package com.in28minute.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.in28minute.model.Employee;

public class CollectionOperation {
    
    
    public static List<Employee> sortByNameAndAgeUsingStream(List<Employee> employees){
        return employees.stream()
                .sorted(
                        (e1,e2) -> e1.getName().compareTo(e2.getName()) != 0 
                        ? e1.getName().compareTo(e2.getName())  : e1.getAge().compareTo(e2.getAge())
                        )
                .collect(Collectors.toList());
    }
    
    
    public static void sortByNameAndAge(List<Employee> employees){
        Collections.sort(employees, 
                new Comparator<Employee>() {
                    public int compare(Employee e1, Employee e2) {
                        return e1.getName().compareTo(e2.getName());
                    }
                }.thenComparing(new Comparator<Employee>() {
                   
                    @Override
                    public int compare(Employee o1, Employee o2) {
                       return o1.getAge().compareTo(o2.getAge());
                    }
                   
                }));
    }
    
    
    public static Map<String,List<Employee>> groupByCity(List<Employee> employees){
         return employees.stream().collect(Collectors.groupingBy(Employee::getCity));
    }

    
    
}
