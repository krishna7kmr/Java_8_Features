package starter;

import entity.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Employee> empList =new ArrayList<Employee>();
        empList.add( new Employee(1,"Alex",28,123,"F","HR","Hyderabad",2020) );
        empList.add( new Employee(2,"Rinki",30,400,"F","HR","Delhi",2022) );
        empList.add( new Employee(3,"Raja",35,700,"M","IT","Hyderabad",2016) );
        empList.add( new Employee(4,"Amit",22,900,"M","IT","Pune",2018) );
        empList.add( new Employee(5,"Rahim",40,1020,"M","HR","Kolkata",2019) );

    // Q1. Grouping employee by city

        Map<String, List<Employee> > empByCity= new HashMap<>();

        empByCity= empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(empByCity);
    }
}