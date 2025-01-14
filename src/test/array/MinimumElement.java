package test.array;

public class MinimumElement {
    public static void main(String[] args) {
        int arr[]={67,12,98,56};

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){ // min<arr[i]
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
