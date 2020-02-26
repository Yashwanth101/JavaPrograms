package programs;

public class LongestSubStringInString {

   // String s = "abcabcdabcdef" //Longest = abcdef (Characters between Starting a and again Starting a)

    public void LongestSubStringInString(){

        String s = "abcabcdabcdef";

        char ch[] = s.toCharArray();
        char c = ch[0];
        int count = 0;
        String temp = "";
        for(int i=0;i<ch.length;i++){

            if(ch[i]==c){

                if(count!=0){
                    temp = s.substring(0,i);
                    break;
                }


            }
            count++;

        }




    }

    public static void main(String[] args) {
        LongestSubStringInString obj = new LongestSubStringInString();
        obj.LongestSubStringInString();
    }
}
