package test.array.exception;

public class Throws {

    public static void main(String[] args){

        try {
            System.out.println(add(7,0));

        }catch (Exception e){
            System.out.println("Arithmetic");
        }
    }


    public static int add(int a,int b) throws Exception{
        return a/b;
    }


}
