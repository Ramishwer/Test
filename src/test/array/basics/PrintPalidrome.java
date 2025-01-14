package test.array.basics;

public class PrintPalidrome {

    public static void main(String[] args) {
        int number=150;

        for(int i=0;i<number;i++){
           if(isPalidrom(i)){
               System.out.println(i);
           }
        }

    }

    private static boolean isPalidrom(int number) {

        int result=0;
        int original=number;
        while (number!=0){
            int remainder=number%10;
            result=result *10+remainder;
            number=number/10;
        }

       return original==result;
    }

}
