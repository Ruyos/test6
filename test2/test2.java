package test2;

public class test2 {
    public static String OnlyNumber(String s){
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=ch.length-1;i++) {
            if (Character.isDigit(ch[i]))
                sb.append(ch[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="ab123you";
        System.out.println(OnlyNumber(s));
    }
}
