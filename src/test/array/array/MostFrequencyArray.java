package test.array.array;

import java.util.HashMap;

public class MostFrequencyArray {

    public static void main(String[] args) {

        int arr[]={1, 13, 13, 5};

        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;
        int frequency=-1;

        for(int ar:arr){
            if(map.containsKey(ar)){
                map.put(ar, map.get(ar)+1);
            }else {
                map.put(ar,1);
            }

            if(map.get(ar)>count){ //1
                count=map.get(ar);//count=2
                frequency=ar;//13
            }
        }

        System.out.println("frequency:"+frequency+",Count:"+ count);
    }
}
