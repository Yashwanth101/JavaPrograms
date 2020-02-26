package programs;

  /*
       String str = "AB CD"
       Resulting String Should be - "BA DC"
   */

import java.util.Arrays;

public class ReverseAStringAtSamePosition {


    String str = "AB CD EF GH";

    String s[] = str.split(" ");

String temp = "";
      public void ReverseStringCode(){


        for(int i=0;i<s.length;i++){

            for(int j=s[i].length()-1;j>=0;j--){
                temp = temp+s[i].charAt(j);

            }
            temp =  temp+" ";

        }

          System.out.println(temp);

      }

      public static void main(String[] args) {
          ReverseAStringAtSamePosition obj = new ReverseAStringAtSamePosition();
          obj.ReverseStringCode();
      }


}

