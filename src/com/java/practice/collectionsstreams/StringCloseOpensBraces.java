package com.java.practice.collectionsstreams;

import java.util.*;
import java.util.stream.Collectors;

public class StringCloseOpensBraces {
    public static void main(String[] args) {
//        String s = "{()}";
        StringCloseOpensBraces stringCloseOpensBraces=new StringCloseOpensBraces();
//        System.out.printf(stringCloseOpensBraces.validatestring(s)+"");
//        int[] arr={-1, -5, 3, 9, -3, 0, 1};
//        System.out.printf(stringCloseOpensBraces.sortingUsingStream(arr).toString());
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("chaitanya",349L,"dev"));
        employeeList.add(new Employee("chaitanya",39L,"it"));
        employeeList.add(new Employee("chaitanya",34L,"dev"));
        employeeList.add(new Employee("chaitanya",49L,"hr"));
        employeeList.add(new Employee("chaitanya",379L,"hr"));
        System.out.println(stringCloseOpensBraces.empavg(employeeList));


    }

    public Boolean validatestring(String s) {
        if(s.length()==0) return false;
        Boolean result=true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}'&& stack.peek()=='{' ||
                    s.charAt(i)==']'&& stack.peek()=='[' ||
                    s.charAt(i)==')'&& stack.peek()=='('){
                    result=true;
                    stack.pop();
                }
            else {
                   return false;
                }
            }
        if(!stack.empty()) return false;
        return result;
    }
    public int[] sortingUsingStream(int[] arr)
    {
        int[] result=Arrays.stream(arr).sorted().toArray();
        Arrays.stream(result).forEach(System.out::println);
        return result;
    }

    public Map<String, Double> empavg(List<Employee> employeeList){
         return employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingLong(Employee::getEmpid)));
    }
}
