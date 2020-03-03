package programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RemoveDuplicatesBasedOnKey {
    LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();
    ArrayList<Integer> al = new ArrayList<>();
    int key = 1;

    public void RemoveDuplicatesBasedOnKey(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            Integer count = hmap.get(a[i]);

            if (count == null) {
                hmap.put(a[i], 1);
                al.add(a[i]);
            } else {
                hmap.put(a[i], ++count);
                if (hmap.get(a[i]) <= key) {
                    al.add(a[i]);
                }
            }


        }

        System.out.println(al);

    }

    public static void main(String[] args) {

        int a[] = {1, 1, 6, 1, 2, 4, 4, 5, 5, 5, 4};

        RemoveDuplicatesBasedOnKey obj = new RemoveDuplicatesBasedOnKey();
        obj.RemoveDuplicatesBasedOnKey(a);

    }
}
