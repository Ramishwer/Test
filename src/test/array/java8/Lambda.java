package test.array.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {

        List<Employee> employee=Arrays.asList(
                new Employee(23,"ram"),
                new Employee(11,"Shyam"),
                new Employee(83,"Shyam"),
                new Employee(87,"sbsd"),
                new Employee(2,"luna")

                );
        List<Employee> list=employee.stream()
                .filter(name->name.getName().startsWith("r") && name.getAge()>10)
                .collect(Collectors.toList());

        list.forEach(employee1 ->
                System.out.println("Name:"+employee1.getName()+"Age:"+employee1.getAge()));
        System.out.println(list);

        Map<String,List<Employee>> map=employee.stream().collect(Collectors.groupingBy(Employee::getName));

        map.forEach((name,employeeList)-> {
            System.out.println("Name:"+name);
            employeeList.forEach(emp->{
                System.out.println("Name:"+emp.getName()+",Age:"+emp.getAge());
            });
        });

        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        for(Employee employee1:employee){
            System.out.println(employee1.getAge()+" "+employee1.getName());
        }


        List<Employee> list2=employee.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        list2.forEach(employee1 -> System.out.println("Name:"+employee1.getName()+"Age:"+employee1.getAge()));
    }
}

class Employee{

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
