package programs;

import java.util.Arrays;

public class ReturnHighestAndLowestNumberInString {

    public int HighestNumber(){

        String s = "123457896";
        char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        int a[] = new int[ch.length];

        for(int i=0;i<ch.length;i++){
            a[i] = Character.getNumericValue(ch[i]);
        }
        System.out.println(Arrays.toString(a));
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReturnHighestAndLowestNumberInString obj = new ReturnHighestAndLowestNumberInString();
        System.out.println(obj.HighestNumber());
    }


}
