package test.array.array;

import java.util.HashMap;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 7, 8, -2, 1, 6};
        int target = 6;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            int complement=target-num;

            if(map.containsKey(complement)){
                System.out.println("{"+complement+","+num+"}");
            }

            map.put(num,1);

        }
    }
}
