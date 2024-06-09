package com.apple.programs.java8;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Programs {

    public  static void main(String[] args){

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


/*
        Predicate<Employee> test = (e2) -> e2.getYearOfJoining() > 2015;

        employeeList.stream().filter(test).forEach(System.out::println);
*/
        Map<String,Double>mapdetails2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        for(Map.Entry<String,Double> details : mapdetails2.entrySet()){
            System.out.println("Department : "+details.getKey()+"  Avg salary: "+details.getValue());
        }

      /*  for(Map.Entry<String,Double> details : mapdetails2.entrySet()){
            System.out.println("Gender : "+details.getKey()+"  Average: "+details.getValue());
        }

       */

        /*
        Map<String,Double>mapdetails2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        for(Map.Entry<String,Double> details : mapdetails2.entrySet()){
            System.out.println("Gender : "+details.getKey()+"  Average: "+details.getValue());
        }

        employeeList.stream().map(Employee::getDepartment).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

        Map<String,Long>mapdetails = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        for(Map.Entry<String,Long> details : mapdetails.entrySet()){
            System.out.println("Gender : "+details.getKey()+"  Number: "+details.getValue());
        }

 */
    }
}
