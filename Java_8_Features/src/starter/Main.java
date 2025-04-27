package starter;

import entity.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        List<Employee> empList =new ArrayList<Employee>();
        empList.add( new Employee(1,"Alex",28,123,"F","HR","Hyderabad",2020) );
        empList.add( new Employee(2,"Rinki",30,400,"F","HR","Delhi",2022) );
        empList.add( new Employee(3,"Raja",35,700,"M","IT","Hyderabad",2016) );
        empList.add( new Employee(4,"Amit",22,900,"M","IT","Pune",2018) );
        empList.add( new Employee(5,"Barun",40,1020,"M","HR","Hyderabad",2019) );
        empList.add( new Employee(6,"Hyena",27,3000,"M","HR","Lucknow",2018) );

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

//        //Q10 Find the youngest female employee
//        Optional<Employee> youngestFemale= empList.stream().filter(i -> i.getGender().equals("F")).min(Comparator.comparing(Employee::getAge));
//        if(youngestFemale.isPresent()){
//            System.out.println(youngestFemale.get());
//        }
//        else{
//            System.out.println("No   female employee found in list");
//        }


        //Q.11 Finding  employee by age range
//        Map<Boolean, List<Employee>> collect = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
//       // collect.forEach((k,v)-> System.out.println(k+" "+v));
//
//        Set< Map.Entry< Boolean, List< Employee> > > entries = collect.entrySet();
//
//        for(Map.Entry< Boolean, List< Employee> > entry: entries){
//            if(Boolean.TRUE.equals(entry.getKey())){
//                System.out.println("Employee greater than 30  years:: "+entry.getValue());
//            }
//        }

        //Q.12 Finding Department with  the Highest Number of Employee

//        Map<String, Long> groupingByDepartName = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
//        //groupingByDepartName.forEach((k,v)-> System.out.println(k+" "+v));
//
//        Optional<Map.Entry<String, Long>> max = groupingByDepartName.entrySet().stream().max(Map.Entry.comparingByValue());
//
//        if(max.isPresent()){
//            System.out.println(max.get());
//        }
        //Q.13 Finding Employee from HR Department

//        Optional<Employee> opt = empList.stream().filter(i -> i.getDeptName().equalsIgnoreCase("HR")).findAny();
//        if(opt.isPresent()){
//            System.out.println(opt.get());
//        }

//        //Q.14 Finding Departments  with Over 3 Employees
//        Map<String, Long> collect   = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
//
//        collect.entrySet().stream().filter(i -> i.getValue() > 3).forEach(System.out::println);

        //Q.15 Fining Distinct Department Names

        //empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //Q.16  Finding and sorting Employee by City
//        empList.stream().filter(i->i.getCity().equalsIgnoreCase("Hyderabad"))
//                .sorted(Comparator.comparing(Employee::getName))
//                .forEach(i->System.out.println(i));
        // Q.17 Counting the number of employees in the organization
//        long count = empList.stream().count();
//        System.out.println("Total employees in the organization  "+count);

        //Q.18 Finding employee count in every  department
//      Map<String,Long> mpCountByDet=  empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
//        mpCountByDet.forEach((k,v)->System.out.println(k+" "+v));

        //Q.19 Find the department with the  highest number of employee
//        Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
//
//        Optional<Map.Entry<String, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
//
//        if(max.isPresent()){
//            System.out.println(max.get());
//        }

        //Q.20 Sort employee by name and age
//      Comparator<Employee> comparator1=  Comparator.comparing(Employee:: getName);
//      Comparator<Employee> comparator2= Comparator.comparing(Employee::getAge);
//
//      empList.stream().sorted(comparator1.thenComparing(comparator2))
//              .forEach(System.out::println);

        //Q.21 Finding the Highest Experienced Employee

//        Optional<Employee> first = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
//        if(first.isPresent()){
//            System.out.println("Experienced employee "+first.get());
//        }

        //Q.22 Printing  average and total salary of the organization

//        DoubleSummaryStatistics empSalary = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("Average salary "+empSalary.getAverage());
//        System.out.println("Total salary "+empSalary.getSum());
//
//        System.out.println("Total salary "+empSalary.getMin());

        //Q.23  Printing average Salary of Each Department
//        Map<String, Double> avgSalaryByDept = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getDeptName,
//                Collectors.averagingDouble(Employee::getSalary)));
//        avgSalaryByDept.forEach((k,v)->System.out.println(k+ " "+v));


        // Q.24 Find the highest salary in the organization   here i am using max()
//     Optional<Employee>  maxSalary= empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
//     if(maxSalary.isPresent()){
//         System.out.println("Max salary of employee "+maxSalary.get().getSalary());
//     }

        // Q.24 Find the highest salary in the organization , try to not used max()
//        Optional<Employee>  maxSalary=    empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
//        if(maxSalary.isPresent()){
//            System.out.println("Max salary of employee "+maxSalary.get().getSalary());
//        }

      // Q.25 Find the  second the highest salary in the organization

//        Optional<Employee> secondHighestSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//        secondHighestSalary.ifPresent(employee -> System.out.println("Second highest salary " + employee.getSalary()));

        // Q.26 Find the  nth the highest salary in the organization
//         int n=3;
//        Optional<Employee> secondHighestSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n-1).findFirst();
//        secondHighestSalary.ifPresent(employee -> System.out.println("nth highest salary " + employee.getSalary()));


        //Q.27 Find the Highest Paid salary in the organization Based on gender
//        Map<String, Optional<Employee>> highestPaidByGender = empList.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getGender,
//                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
//                ));
//
//        // Print results
//        highestPaidByGender.forEach((gender, emp) ->
//                System.out.println("Gender: " + gender + ", Highest Paid: " + emp.get().getSalary()));
//

        //Q.28 Find the lowest paid salary in the organization based on Gender
//        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender,
//                Collectors.minBy(Comparator.comparing(Employee::getSalary))));
//        collect.forEach((k,v)-> System.out.println("Lowest salary in org"+k+""+v ));

        //Q.29 Sorting Employee salary  in ascending order
       //empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(System.out::println);

        //Q.30 Sorting Employee salary  in descending order
       //empList.stream().sorted( Comparator.comparing(Employee::getSalary).reversed()  ).toList().forEach(System.out::println);

        //Q.31 Find the Highest salary based on Department
//        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName
//                , Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//
//        collect.forEach((k,v)->System.out.println(k+" "+v.get().getSalary()));

        //Q.32 Find the second highest salary based on Department

//        Map<String, Optional<Employee>> secondHighestSalaryByDept = empList.stream()
//                .collect(
//                        Collectors.groupingBy(
//                        Employee::getDeptName,Collectors.collectingAndThen(Collectors.toList(),list->list.stream()
//                                        .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()
//                                )
//                        )
//                    );
//
//        secondHighestSalaryByDept.forEach((k,v)-> System.out.println(k+" "+v));



        //Q.33 Sorting the Employees salary in each department in Ascending order
//        Map<String, Stream<Employee>> sortedEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
//        Collectors.collectingAndThen(Collectors.toList(),
//                list -> list.stream().sorted(Comparator.comparing(Employee::getSalary)))));
//
//        sortedEmp.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v.collect(Collectors.toList()));
//        }
//    );

        //Q.34  Sorting the Employees salary in each department in Decending order

        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.collectingAndThen(Collectors.toList(),list->list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                ))).forEach((k,v)-> System.out.println(k+"  "+v.toList()));


    } // main
}// class