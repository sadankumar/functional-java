package org.sadan.java8questions.bookreference;

import java.util.ArrayList;
import java.util.List;

public class ProblemAndSolution {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Sam", "MALE", 2000),
                new Employee("Mena", "FEMALE", 1200),
                new Employee("Parkar", "MALE", 800),
                new Employee("Susi", "FEMALE", 2000)
        );
        increaseSalary(employees,1.10);
        incomeGreaterThan(employees, 2000);
        combinedIncomeAllEmp(employees);

        //Q: what if there is a null
        increaseSalaryWithNullCheck(employees,1.10);
    }

    private static void increaseSalaryWithNullCheck(List<Employee> employees, double incBy) {
        Employee e1 = new Employee("Mena", "FEMALE", 1200);
        Employee e2 = new Employee("Parkar", "MALE", 800);
        Employee e3 = new Employee("Susi", "FEMALE", 2000);
        Employee e4 = new Employee("kim", null, 2000);
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.stream()
                .filter(emp -> "FEMALE".equalsIgnoreCase(emp.getGender()))
                .forEach(emp -> emp.setSalary(emp.getSalary() * incBy));
    }

    private static void combinedIncomeAllEmp(List<Employee> employees) {
        Double reduce = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(reduce);
    }

    private static void incomeGreaterThan(List<Employee> employees, int salary) {
        employees.stream()
                .filter(e -> e.getSalary() > salary)
                .forEach(System.out::println);
    }

    public static void increaseSalary(List<Employee> employees, double incBy){
        List<Employee> female = employees.stream()
                .filter(emp -> emp.getGender().equalsIgnoreCase("FEMALE"))
                .map(emp -> {
                    emp.setSalary(emp.getSalary() * incBy);
                    return emp;
                })
                .toList();
        //female.forEach(System.out::println);

        // the above approach is wrong and error pron
        // we are mutating the state
        // its not pure functional
        employees.stream()
                .filter(emp -> "FEMALE".equalsIgnoreCase(emp.getGender()))
                .forEach(emp -> emp.setSalary(emp.getSalary() * incBy));
        // looping and mutating

        //Approach2 : Immutable way
        List<Employee> female1 = employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("FEMALE"))
                .map(e -> new Employee(
                        e.getName(), e.getGender(), e.getSalary() * incBy
                ))
                .toList();
       // female1.forEach(System.out::println);


    }
}
