package programs;

import java.util.Arrays;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String str = "abca";
        char ch[] = str.toCharArray();
        char c[] = new char[3];
        for(int i=0;i<ch.length-1;i++){
            for(int j=0;j<(ch.length-i)-1;j++){
                if(ch[j]>ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ch));
        int k=0;
       for(int i=0;i<ch.length-1;i++){
           if(ch[i]!=ch[i+1]){
               c[k] = ch[i];
               k++;
           }

       }
       c[k] = ch[ch.length-1];

        System.out.println(Arrays.toString(c));


    }
}
