package test.array.string;

import java.util.HashMap;

public class MaximumCharcter {

    public static void main(String[] args) {

        String str="Hello World!";

        String lowerString=str.toLowerCase();

        char[] chars=lowerString.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();


        for(char ch:chars){
           if(map.containsKey(ch)){
               map.put(ch, map.get(ch)+1);
           }else {
               map.put(ch,1);
           }

        }

    int countmax=0;
    char maxChar=' ';


    for (char key:map.keySet()){
        if(map.get(key)>countmax){
            countmax=map.get(key);
            maxChar=key;
        }
    }

        System.out.println("Max Count:"+countmax+",Max Character:"+maxChar);
    }
}
