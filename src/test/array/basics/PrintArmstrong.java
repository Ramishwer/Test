package test.array.basics;

public class PrintArmstrong {

    public static void main(String[] args) {
        int number=153;
//        for(int i=0;i<number;i++){
//            if(isArmStrong(i)){
//                System.out.println(i);
//            }
//        }
        if(isArmStrong(number)){
            System.out.println("Arm");
        }else {
            System.out.println("Not");
        }

    }

    private static boolean isArmStrong(int number) {
        int result=0;
        int orginal=number;

        while (number!=0){
            int remainder=number%10;
            result+=Math.pow(remainder,3);
            number=number/10;
        }

        return result==orginal;
    }
}
