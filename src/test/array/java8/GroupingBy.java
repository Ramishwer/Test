package test.array.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        List<Student> students= Arrays.asList(
                new Student("ram",45),
                new Student("Shyam",23),

                new Student("kunal",12),

                new Student("Soham",12),

                new Student("ram",45)

        );


      Map<Integer,List<Student>> map= students.stream().collect(Collectors.groupingBy(Student::getAge));

      map.forEach((age,studentList)->{
          System.out.println("Age:"+age);

          studentList.forEach(student->{
              System.out.println("Name:"+student.getName()+"Age: "+student.getAge());
          });
      });
    }




}
