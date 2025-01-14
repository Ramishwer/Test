package test.array.oops.polymorsphism;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(MethodOverloading.add(2,3));
        System.out.println(MethodOverloading.add(2,3,4));
    }


    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
}



