package starter;

import entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        List<Employee> empList =new ArrayList<Employee>();
        empList.add( new Employee(1,"Alex",28,123,"F","HR","Hyderabad",2020) );
        empList.add( new Employee(2,"Rinki",30,400,"F","HR","Delhi",2022) );
        empList.add( new Employee(3,"Raja",35,700,"M","IT","Hyderabad",2016) );
        empList.add( new Employee(4,"Amit",22,900,"M","IT","Pune",2018) );
        empList.add( new Employee(5,"Rahim",40,1020,"M","HR","Kolkata",2019) );

    // Q1. Grouping employee by city

//        Map<String, List<Employee> > empByCity= new HashMap<>();
//
//        empByCity= empList.stream().collect(Collectors.groupingBy(Employee::getCity));
//       //System.out.println(empByCity);
//        empByCity.forEach((k,v)-> System.out.println(k+" "+v));


// Q2. Group employee by age
//   Map<Integer, List<Employee>> empByAge=new HashMap<>();
//        empByAge=  empList.stream().collect(Collectors.groupingBy(Employee::getAge));
//
//        empByAge.forEach((k,v)-> System.out.println(k+" "+v));

  // Q3. Find the count of Male and Female employee

//      Map<String, Long> empCountByMaleAndFemale= empList.stream().collect( Collectors.groupingBy( Employee::getGender,Collectors.counting() )  );
//
//        empCountByMaleAndFemale.forEach((k,v)-> System.out.println(k+"  "+v));

//Q4. Print name of all department

   // empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

//Q5 Print employee details by Age criteria
      //  empList.stream().filter(i->i.getAge()>28).forEach(System.out::println);

// Q6  Find Maximum age of employee
//        OptionalInt max = empList.stream().mapToInt(Employee::getAge).max();
//        if(max.isPresent()){
//            System.out.println(max.getAsInt());
//        }

        //Q7 Print average age of male and female
//        Map<String ,Double> avg=
//        avg=empList.stream().collect(Collectors.groupingBy( Employee::getGender,Collectors.averagingInt(Employee::getAge) ));
//
//        avg.forEach((k,v)->System.out.println(k+" "+v));

        //Q8 Print number of employee in each department
//        Map<String,Long> numberOfEmpInDept;
//        numberOfEmpInDept= empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
//        numberOfEmpInDept.forEach((k,v)->System.out.println(k+" "+v));

        //Q9. Find the oldest employee
//        Optional<Employee> oldestEmp;
//        oldestEmp= empList.stream().max(Comparator.comparing(Employee::getAge));
//        if(oldestEmp.isPresent()){
//            System.out.println(oldestEmp.get());
//        }
//        else{
//            System.out.println("No employee find in list");
//        }

        //Q10 Find the youngest female employee
        Optional<Employee> youngestFemale= empList.stream().filter(i -> i.getGender().equals("F")).min(Comparator.comparing(Employee::getAge));
        if(youngestFemale.isPresent()){
            System.out.println(youngestFemale.get());
        }
        else{
            System.out.println("No   female employee found in list");
        }

    }
}