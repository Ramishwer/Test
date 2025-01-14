package test.array.exception;


public class ExceptionHandling {

    public static void main(String[] args) {

        try{
            System.out.println(add(4,0));

        }catch (Exception e){
            System.out.println("Aritmetic Exception");
        }

        try{
            System.out.println(add(4,2));

        }catch (Exception e){
            System.out.println("Aritmetic Exception");
        }

    }


    public static int add(int a ,int b){
        return a/b;
    }
}








