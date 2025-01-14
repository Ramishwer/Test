package test.array.basics;

public class Palidrome {

    public static void main(String[] args) {
        int number=121;

        int result=0;

        int originalno=number;

        while (number!=0){
            int remainder=number%10;
            result=result*10+remainder;
            number=number/10;
        }

        if(result==originalno){
            System.out.println("palidrome");
        }else {
            System.out.println("Not");
        }
    }
}
