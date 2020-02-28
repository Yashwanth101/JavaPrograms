package programs;

public class ReverseAStringInSamePattern {

    public static void main(String[] args) {

        /*
            String str = "The word is A";
            Expected Result is = "Asi drow eh T"

         */

        String str = "The word is A";
        String temp = "";
        for(int i=str.length()-1;i>=0;i--){
           temp+=str.charAt(i);
        }
        String tWS = temp.replace(" ","");
       // System.out.println(tWS);

        String q[] = str.split(" ");
        String ReversedString = "";
        int k = 0;
        int l = 0;
        for(int i=0;i<q.length;i++){

            l += q[i].length();
            int temp2 = l;

            ReversedString+= tWS.substring(k,l)+" ";

            k = temp2;


        }

        System.out.println(ReversedString);

    }


}
