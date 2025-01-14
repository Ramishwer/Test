package test.array;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={45,34,12,67,45,12};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ar:arr){
            if(map.containsKey(ar)){
                map.put(ar,map.get(ar)+1);
            }else {
                map.put(ar,1);
            }
        }


//      for(Map.Entry<Integer, Integer> entry:map.entrySet()){
//          if(entry.getValue()==1){
//              System.out.println(entry.getKey()+":"+ entry.getValue());
//          }
//      }

        int count=0;
        for(Integer key: map.keySet()){
            if(map.get(key)==1){
                count++;
                if(count==2){
                    System.out.println(key);

                }
               // return;
            }
        }
    }
}
