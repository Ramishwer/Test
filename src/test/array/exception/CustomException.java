package test.array.exception;

public class CustomException {

    public static void main(String[] args) {


        try {
            printValue();

        }catch (InavalidAgeException e){
            System.out.println("Exception:"+e);
        }

        try {
            validateAge(11);



        }catch (InavalidAgeException e){
            System.out.println("Exception:"+e);
        }
    }

    public static void validateAge(int age) throws InavalidAgeException {
        if(age<12){
            throw new InavalidAgeException("Age must be grater than 12");
        }

        else {
            System.out.println("Valid Age");
        }
    }


    public static void printValue() throws InavalidAgeException{
        for (int i =0;i<10;i++){
            if(i==2){
                throw new InavalidAgeException("Age must be 10");
            }
        }

        System.out.println("correct");
    }


}

class InavalidAgeException extends Exception{

    public InavalidAgeException(String str){
        super(str);
    }
}
