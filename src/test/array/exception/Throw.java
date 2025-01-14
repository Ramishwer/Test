package test.array.exception;

public class Throw {

    public static void main(String[] args) {

        try {
            validateAge(12);

        }catch (Exception e){
            System.out.println("Caught Exception:"+e.getMessage());
        }
    }

    public static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }

        System.out.println("Valid");
    }
}
