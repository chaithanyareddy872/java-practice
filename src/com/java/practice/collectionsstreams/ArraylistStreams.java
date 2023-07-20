package com.java.practice.collectionsstreams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraylistStreams {
    public static void main(String[] args) {
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("hi");
//        arrayList.add("hello");
//        arrayList.add("everyone");

        //filter demo
//        arrayList.stream().filter(val->val=="hi").forEach(System.out::println);
        //map demo
//        arrayList.stream().map(val->{return Arrays.stream(val.split("")).count();}).forEach(System.out::println);
        //reduce demo
//        String vals=arrayList.stream().reduce(" ",(val,val1)->{return  val+" "+val1;});
//        System.out.printf(vals);

//        List<Employee> employee=new ArrayList<>();
//        employee.add(new Employee("chaitanya",2342L,"dev"));
//        employee.add(new Employee("arav",24L,"qa"));
//        employee.stream().sorted(Comparator.comparing(Employee::getEmpid).
//                thenComparing(Employee::getName)).forEach(employee1 -> System.out.println(employee1.toString()));


//        Map<Character,Long> samplemap=new HashMap<>();
//        Map<String,Long> stringLongMap=new HashMap<>();
//        String sample="sample string to test number of duplicates";
//        samplemap=sample.chars().mapToObj(ch->(char)ch).collect(
//                Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        samplemap.entrySet().stream().filter(sampled->{return sampled.getValue()>2;}).forEach(System.out::println);

//        stringLongMap=Stream.of(sample.split("")).filter(s->!(s.equals(" ")))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        stringLongMap.entrySet().stream().filter(e->e.getValue()>1).forEach(e->{
//            System.out.println(e);});
//        int num=34234;
//        int res=0;
//        int rem=0;
//        while (num>0){
//            rem=num%10;
//            res=res*10+rem;
//            num=num/10;
//        }
//        System.out.println(res);
//
//        System.out.println(IntStream.range(0,11));
//        int a=10,b=20;
//        a=a-b;
//        b=a+b;
//        a=b-a;
//        System.out.println(a+" "+b);
//        Set<Integer> integerSet=new HashSet<>();
//        Set<Integer> integerSet1=new HashSet<>();
//        integerSet.addAll(Arrays.asList(1,2,3,4,5));
//        integerSet1.addAll(Arrays.asList(0,1,2,3,5));
//        for (Integer in:integerSet) {
//            if(integerSet1.add(in)==true) System.out.println(in);
//        }
        String s="hi hello";
        char[] arraychars=s.toCharArray();
        int len=s.length();
        for (int i=len-1;i>=0;i--) {
            System.out.print(arraychars[i]);
        }
        
    }
}