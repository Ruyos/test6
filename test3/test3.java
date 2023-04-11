package test3;

import java.util.StringTokenizer;
public class test3 {
    public static double markCount(String s) {
        StringTokenizer st = new StringTokenizer(s, "数学分，物理英语");
        double count = 0;
        double averageScore = 0;
        int flag = 0;
        while (st.hasMoreTokens()) {
            count += Integer.parseInt(st.nextToken());
            flag++;
        }
        if (flag != 0) {
            averageScore = count / flag;
        }
        System.out.println(count);
        return averageScore;
    }

    public static void main(String[] arg) {
        String s = "数学87分，物理76分，英语96分";
        System.out.println(markCount(s));
    }
}