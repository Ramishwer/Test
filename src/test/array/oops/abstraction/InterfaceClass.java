package test.array.oops.abstraction;

public class InterfaceClass {

    public static void main(String[] args) {
        NewRule newRule=new NewRule();
        newRule.rule();
    }
}


interface Emp2{
     void rule();
}

class NewRule implements Emp2{

    @Override
    public void rule() {
        System.out.println("interafce");
    }
}
