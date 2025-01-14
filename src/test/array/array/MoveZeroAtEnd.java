package test.array.array;

public class MoveZeroAtEnd {

    public static void main(String[] args) {
        int arr[]= {12, 0, 7, 0, 8, 0, 3};

        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        while (count<arr.length){
            arr[count]=0;
            count++;
        }

        for (int ar:arr){
            System.out.println(ar);
        }


    }
}
