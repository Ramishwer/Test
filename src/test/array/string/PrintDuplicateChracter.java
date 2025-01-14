package test.array.string;

import java.util.HashMap;

public class PrintDuplicateChracter {

    public static void main(String[] args) {

        String str="Hello World!";

        HashMap<Character,Integer> map=new HashMap<>();

        String lowerCaseString=str.toLowerCase();

        for(char ch:lowerCaseString.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                System.out.println(ch);
            }
        }

    }

}

