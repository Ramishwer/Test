package test.array.string;

import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {
        String str="Hello World";

        HashMap<String,Integer> map=new HashMap<>();

        String lowerCaseString=str.toLowerCase();

        String words[]=lowerCaseString.split("\\s+");

        for (String str1:words){
            if(map.containsKey(str1)){
                map.put(str1, map.get(str1)+1);
            }else {
                map.put(str1,1);
            }
        }

        for(String word: map.keySet()){
            System.out.println("Word:"+word+" ,Count:"+map.get(word));
        }


    }
}
