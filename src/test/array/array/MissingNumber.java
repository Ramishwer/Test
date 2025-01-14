package test.array.array;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,6};

        int n=arr.length+1;

        int sum=(n*(n+1))/2;

        int sum2=0;

        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }

        int result=sum-sum2;

        System.out.println(result);
    }
}
