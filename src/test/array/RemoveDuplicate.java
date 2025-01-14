package test.array;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={78,12,45,67,12};


        HashSet<Integer> set=new HashSet<>();

        for(Integer ar:arr){
            set.add(ar);
        }

        System.out.println(set);
    }
}
