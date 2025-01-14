package test.array.string;

import java.util.HashMap;
import java.util.Map;

public class FindMaxCharacter {

    public static void main(String[] args) {
        String str="Java";

        String lowerCaseString=str.toLowerCase();

        char[] chars=lowerCaseString.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:chars) {
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int maxCount = 0;

        char charss=' ';
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()>maxCount){
               charss=entry.getKey();
               maxCount=entry.getValue();
           }
       }

        System.out.println(charss);
       // System.out.println(maxCount);

    }
}
