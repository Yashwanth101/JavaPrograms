package programs;

import java.util.LinkedHashMap;

public class LargestCountOfTheConsecutiveNumbers {

    public static void main(String[] args) {

        // Should Print Largest Count of the Consecutive Numbers

        int a[] = {1, 2, 2, 4, 1, 1, 2, 2, 5, 2, 1, 1, 4, 4, 4, 4, 4, 5, 5};
        int count = 1;
        LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {

                count++;

            } else {
                if (hmap.get(a[i]) == null) {
                    hmap.put(a[i], count);
                    count = 1;
                } else {
                    count = 1;
                }


            }
            if (hmap.get(a[i]) != null) {
                if (hmap.get(a[i]) <= count) {
                    hmap.put(a[i], count);
                }
            }

        }

        System.out.println(hmap);

    }
}
