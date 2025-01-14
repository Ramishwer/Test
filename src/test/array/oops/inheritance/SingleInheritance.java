package test.array.oops.inheritance;

public class SingleInheritance {
    public static void main(String[] args) {

        Bike bike=new Bike();
        bike.bike();
        bike.main();
    }
}


class Vehicle{
    int name=23;
    int age=98;

    public void main(){
        System.out.println(name +":::"+ age);
    }
}

class Bike extends Vehicle{
    public void bike(){
        System.out.println("bike");
    }
}
