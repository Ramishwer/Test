package test.array;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        List<Company>list=new ArrayList<>();
        list.add(new Company("Ram","Developer"));
        list.add(new Company("Shyam","Developer"));

        list.add(new Company("John","Testing"));

        list.add(new Company("Doe","Anayast"));
        list.add(new Company("Rallis","Testing"));



//        Map<String,List<Company>> map=list.stream().collect(Collectors.groupingBy(Company::getDesignation));
//
//        map.forEach((designation,emlpoyeeList)->{
//            System.out.println("Designation:"+designation);
//
//            System.out.println("Name:");
//            emlpoyeeList.forEach(e->{
//                System.out.println(e.getName());
//            });
//        });

//        List<Company> companies=list.stream().sorted(Comparator.comparing(Company::getDesignation).reversed()).collect(Collectors.toList());
//
//        companies.forEach(e->{
//            System.out.println(e.getDesignation()+":"+e.getName());
//        });


//     List<Company> companies=list.stream().filter(x->x.getName().startsWith("R") && x.getName().endsWith("m")).collect(Collectors.toList());
//
//     companies.forEach(e->{
//         System.out.println(e.getName());
//     });


//        Runnable runnable=()->{
//            for(int i=0;i<5;i++){
//                System.out.println(i);
//            }
//        };
//        Thread thread=new Thread(runnable);
//        thread.start();
    }
}

class Company{

    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Company(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
}
