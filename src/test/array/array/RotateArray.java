package test.array.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int k) {

        int n=arr.length;

        k=k%n;

        reverseArray(arr,0,n-1);

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {

        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
}
