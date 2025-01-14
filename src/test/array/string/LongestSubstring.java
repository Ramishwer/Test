package test.array.string;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {

        String str="abcabcdbb";

        int maxlen=logestSubstring(str);

        System.out.println(maxlen);
        }

        public static int logestSubstring(String str){

        int maxLength=0;

        int left=0;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0;right<str.length();right++){
           char charraay=str.charAt(right);

           if(map.containsKey(charraay)){
               left=Math.max(left,map.get(charraay)+1);
           }else {
               map.put(charraay,right);

               maxLength=Math.max(maxLength,right-left+1);
           }
        }

        return maxLength;
        }

    }

