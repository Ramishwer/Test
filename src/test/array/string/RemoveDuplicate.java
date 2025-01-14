package test.array.string;


public class RemoveDuplicate {

    public static void main(String[] args) {
        String str="Hello World";

        String lowerStr=str.toLowerCase();

        char[] chars=lowerStr.toCharArray();

        boolean[] seen= new boolean[256];

        StringBuilder stringBuilder=new StringBuilder();

        for(char ch:chars){

            if(!seen[ch])
            {
                seen[ch]=true;
                stringBuilder.append(ch);
            }
        }
        
        System.out.println(stringBuilder);

    }
}
