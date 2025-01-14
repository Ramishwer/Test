package test.array.array;

import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {

        int arr[]={45,12,23,11,23,45};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ar:arr){
            if(map.containsKey(ar)){
                map.put(ar,map.get(ar)+1);
            }else {
                map.put(ar,1);
            }
        }
        System.out.println("Duplicate ELement:");

        for(int ar:map.keySet()){

            if(map.get(ar)>1){
                System.out.print(ar+" ");
            }
        }
    }
}
