package programs;

import java.util.ArrayList;

public class LeadersInAnArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        boolean b = false;

        int a[] = {21, 14, 10, 9, 8, 11, 20,20, 7};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    b = true;
                } else {
                    b = false;
                    break;
                }

            }

            if (b == true) {
                al.add(a[i]);
            }

        }


        for (int g : al) {
            System.out.println(g);
        }
    }

}
