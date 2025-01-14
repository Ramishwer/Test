package test.array.basics;

public class ArmStrongNumber {

    public static void main(String[] args) {
        int number=153;

        int result=0;

        int orginalno=number;

        while (number!=0){
            int remainder=number%10;
            result+= Math.pow(remainder,3);
            number=number/10;
        }

        if(result==orginalno){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not");
        }
    }
}
