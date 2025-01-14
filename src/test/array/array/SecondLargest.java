package test.array.array;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[]={23,45,67,11,24};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }

        System.out.println(largest);
    }
}
