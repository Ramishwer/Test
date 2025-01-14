package test.array.basics;

public class Factorial {

    public static void main(String[] args) {

        int numbaer=5;

        int result=1;
        for(int i=1;i<=numbaer;i++){

            result=result*i;
        }

        System.out.println(result);
    }
}
