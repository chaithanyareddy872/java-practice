package com.java.practice.collectionsstreams;

public class Employee {
    private String name;
    private Long empid;
    private  String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public Employee() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee(String name, Long empid, String dept) {
        this.name = name;
        this.empid = empid;
        this.dept = dept;
    }
}
