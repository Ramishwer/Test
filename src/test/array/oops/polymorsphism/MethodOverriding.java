package test.array.oops.polymorsphism;

//method overriding
public class MethodOverriding {

    public static void main(String[] args) {
        Vehicle2 vehicle2=new Vehicle2();
        vehicle2.step();
    }
}

class Vehicle1{
    public void step(){
        System.out.println("step");
    }
}

class Vehicle2 extends Vehicle1{
    @Override
    public void step(){
        System.out.println("step2");
    }
}