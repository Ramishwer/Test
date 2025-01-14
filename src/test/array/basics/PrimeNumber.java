package test.array.basics;

public class PrimeNumber {

    public static void main(String[] args) {
        int number=10;

        boolean prime=isPrime(number);

        if(prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }

    private static boolean isPrime(int number) {

        if(number<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
