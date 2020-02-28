package programs;

import java.util.Arrays;

public class LongestSubStringInString {

    // String s = "abcabcdabcdef" //Longest = abcdef (Characters between Starting a and again Starting a)

    public void LongestSubStringInString() {

        String s = "abcabcdabcdef";

        char ch[] = s.toCharArray();
        char c = ch[0];
        int count = 0;
        String temp = "";
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == c) {

                if (count != 0) {
                    temp = s.substring(0, i);
                    break;
                }


            }
            count++;

        }
        String temp2 = "";
        String g[] = s.split(temp);
        int max = g[0].trim().length();
        for (int i = 0; i < g.length; i++) {
            if (g[i].trim().length() > max) {
                max = g[i].trim().length();
                temp2 = g[i].trim();
            }
        }

        System.out.println(temp + temp2);


    }

    public static void main(String[] args) {
        LongestSubStringInString obj = new LongestSubStringInString();
        obj.LongestSubStringInString();
    }
}
