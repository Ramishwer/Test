package test.array.string;

import java.util.HashMap;

public class AnagramString {

    public static void main(String[] args) {
        String str="silent";
        String str1="listen";


       String newstr = str.replaceAll("\\s", "").toLowerCase();

        String newstr1 = str1.replaceAll("\\s", "").toLowerCase();

        if(newstr.length()!=newstr1.length()){
            System.out.println("Not Anagrams");
            return;
        }


        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (char ch1:str1.toCharArray()){
           if (!map.containsKey(ch1)){
               System.out.println("Not anagram");
               return;
           }

           map.put(ch1,map.get(ch1)-1);


           if(map.get(ch1)==0){
               map.remove(ch1);
           }
        }


        if(map.isEmpty()){
            System.out.println("Anagram of string");
        }else {
            System.out.println("Anagarm String");
        }

    }
}
