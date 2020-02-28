package programs;

import java.util.Arrays;

public class SortTheSentenceAccordingToTheLengthOfTheWord {
    public static void main(String[] args) {

        String a = "This is a Sentence Added";
        String b[] = a.split(" ");
        for (int i = 0; i < b.length - 1; i++) {

            for (int j = 0; j < (b.length - i) - 1; j++) {

                if (b[j].length() > b[j + 1].length()) {
                    String temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;

                }
            }

        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            sb.append(b[i] + " ");
        }

        String Reversed = sb.toString();
        System.out.println(Reversed);


    }
}
