package test.array;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        String sentence = "Hello World";

        duplicateCharacter(sentence);

    }

    public static void duplicateCharacter(String sentence) {

        String lowerCase=sentence.toLowerCase();

        char[] chars=lowerCase.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();
       int vowel=0;
        int cons=0;

       for (char ch:chars) {
           // map.put(ch ,map.getOrDefault(ch,0)+1);
          // if (Character.isAlphabetic(ch)) {


               if (map.containsKey(ch)) {
                   map.put(ch, map.get(ch) + 1);
               } else {
                   map.put(ch, 1);
               }

        //   }


           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
               vowel++;
           }else if (Character.isAlphabetic(ch)){
               cons++;
           }
      }


        System.out.println("Vowel:"+vowel+"cnsonent:"+cons);
    }
}
