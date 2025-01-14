package test.array.oops.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        Simple simple=new Simple();
        simple.setName("grr");
        simple.setAge(67);

        System.out.println(simple.getName());
        System.out.println(simple.getAge());

    }
}

class Simple{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
