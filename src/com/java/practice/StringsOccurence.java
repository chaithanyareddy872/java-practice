package com.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class StringsOccurence {
    public static void main(String[] args) {
//        System.out.println(StringsOccurence.numberofoccurencesinline("hai hello hi how are hi you hello hi"));
//        System.out.println(new StringsOccurence().finterface.multiply(10,20)+"");
        StringsOccurence.empval();
    }

    public static Set<String> numberofoccurencesinline(String val){
        ArrayList<String> values= (new ArrayList(List.of(val.split(" "))));
        Set<String> result=new HashSet<>();
        Set<String> valuesfinal=values.stream().filter(x->{return !result.add(x);}).collect(Collectors.toSet());
//        values.stream().skip(2).forEach(x-> System.out.println(x));
//        Map<String,Long> result=values.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        return valuesfinal;
        return valuesfinal;
    }

    public static void empval(){
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(new Employee(1,"chaitanya",40000D,"development"
                ,"banglore"));
        employeeArrayList.add(new Employee(2,"hari",80000D,"devops","hydrabad"));
        employeeArrayList.add(new Employee(4,"ravi",30000D,"testing","banglore"));
        employeeArrayList.add(new Employee(23,"raju",20000D,"support","chennai"));
        employeeArrayList.add(new Employee(89,"charan",70000D,"development","banglore"));
//        employeeArrayList.stream().filter(employee -> employee.getSalary()>50000).forEach(System.out::println);
//        System.out.println(employeeArrayList.stream().collect(Collectors.groupingBy(Employee::getDepartment
//                ,Collectors.counting())));
//        System.out.println(employeeArrayList.stream().collect(Collectors.groupingBy(Employee::getDepartment
//                ,Collectors.averagingDouble(Employee::getSalary))));
        Optional<Employee> employeeOptional=employeeArrayList.stream().collect(Collectors
                .maxBy(Comparator.comparingDouble(Employee::getSalary)));
//        System.out.println(employeeOptional.get());
//        Optional<Employee> employeeOptional=employeeArrayList.stream().filter(employee -> employee.getLocation()
//                =="banglore").collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
//                System.out.println(employeeOptional.get());
//        System.out.println(employeeArrayList.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

        DoubleSummaryStatistics summaryStatistics=employeeArrayList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(summaryStatistics.toString());
    }


   finterface finterface= (a,b)-> a*b;
}
