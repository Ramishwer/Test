package test.array.stack;

import java.util.Stack;

public class ValidPranthesis {

    public static void main(String[] args) {
        String str="[{()}]";

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char chars=str.charAt(i);

            if(chars=='[' || chars=='{' || chars=='('){
                stack.push(chars);
            }else if ((chars==']' && stack.peek()=='[') ||
                    (chars=='}' && stack.peek()=='{') ||
                    (chars==')' && stack.peek()=='(')
            ){
                stack.pop();
            }

            else {
                stack.push(chars);

            }


        }

        if(stack.isEmpty()){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }


    }
}
