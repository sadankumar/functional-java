package org.sadan.java8questions.bookreference;

public class Employee {
    private String name;
    private String gender;
    private double salary;

    public Employee(String name, String gender, double salary)
    {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "[" +this.name+ "," + this.gender + "," + this.salary+"]";
    }
}
