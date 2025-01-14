package test.array.oops.inheritance;

public class MultilevelInheritance {

    public static void main(String[] args) {
        Cat dog=new Cat();
        dog.sleep();
        dog.bark();
        dog.cat();
    }
}


class Animal{
    public void bark(){
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    public void sleep(){
        System.out.println("Dog");
    }
}

class Cat extends Dog{
    public void cat(){
        System.out.println("Cat");
    }
}
