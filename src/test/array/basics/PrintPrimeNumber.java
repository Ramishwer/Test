package test.array.basics;

public class PrintPrimeNumber {

    public static void main(String[] args) {

        int number=10;

        for(int i=2;i<number;i++){
            if( isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {

        if(number<=1){
            return false;
        }

        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
