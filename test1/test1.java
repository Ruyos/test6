package test1;
public class test1 {
    public static char NewCharAt(String s, int index) {
        char[] ch = s.toCharArray();
        return ch[index];
    }
    public static String NewReverse(String s){
        char[] ch =s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(NewCharAt(s, 0));
        System.out.println(NewReverse(s));
    }
}
