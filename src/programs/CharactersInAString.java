package programs;

import java.util.ArrayList;

public class CharactersInAString {

    public void chatInString(){

        String str = "ABC123BHS90233";
        char ch[] = str.toCharArray();
        ArrayList<Character> al = new ArrayList<>();

        for(int i=0;i<ch.length;i++){

            if(ch[i]>='0' && ch[i]<='9'){
                al.add(ch[i]);
            }

        }

        for (char c:al) {
            System.out.print(c);
        }

    }

    public static void main(String[] args) {
        CharactersInAString obj = new CharactersInAString();
        obj.chatInString();
    }
}
