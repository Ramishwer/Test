package test.array.oops.abstraction;

public class AbstractClass {

    public static void main(String[] args) {

        NewEmp newEmp=new NewEmp();
        newEmp.age();
    }
}

abstract class Emp {
    abstract void age();
}

class NewEmp extends Emp {

    @Override
   public void age() {
        System.out.println("Ageeee");
    }
}