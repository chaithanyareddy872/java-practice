package com.java.practice;

public class Employee {
    private int empid;
    private String name;
    private double salary;
    private String department;
    private String location;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee() {
    }

    public Employee(int empid, String name, double salary, String department, String location) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.location = location;
    }


}
