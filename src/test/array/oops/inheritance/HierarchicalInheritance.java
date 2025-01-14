package test.array.oops.inheritance;

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Car3 car1=new Car3();
      //  car1.car2();  complie time error
        System.out.println(car1.car1(2,4));
        car1.car3();
    }


}

class Car{
    public int car1(int a,int b){
        return a+b;
    }
}

class Car1 extends Car{
    public void car2(){
        System.out.println("car2");
    }
}

class Car3 extends Car{
    public void car3(){
        System.out.println("car3");
    }
}
