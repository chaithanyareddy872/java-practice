package com.java.practice.collectionsstreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args) {
//        List<Employee> employeeList=new ArrayList<>();
//        employeeList.add(new Employee("hi",393L,"dev"));
//        employeeList.add(new Employee("hi",394L,"prod"));
//        employeeList.add(new Employee("hi",398L,"dev"));
//        employeeList.add(new Employee("hi",392L,"test"));
//        List<Employee> resultlist=employeeList.stream().filter(employee ->employee.getEmpid()>393).collect(Collectors.toList());
////        resultlist.stream().forEach(employee -> System.out.printf(employee.toString()));
//        Optional<Employee> resultlist1=employeeList.stream().min(Comparator.comparingLong(Employee::getEmpid));
//        System.out.println(resultlist1.get().getName()+" " +resultlist1.get().getEmpid());
        Random random=new Random();
        System.out.println(random.nextInt(90)-30);
    }
}
