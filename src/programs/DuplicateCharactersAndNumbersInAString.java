package programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersAndNumbersInAString {

    public void DuplicateCharacters() {

        String s = "abcaaaefef";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char a[] = s.toCharArray();

        for (char s1 : a) {

            Integer count = hashMap.get(s1);

            if (count == null) {
                hashMap.put(s1, 1);
            } else {
                hashMap.put(s1, ++count);
            }

        }

        for (Map.Entry<Character, Integer> dd : hashMap.entrySet()) {

            if (dd.getValue() > 1) {
                System.out.println(dd.getKey() + "------" + dd.getValue());
            }

        }


    }

    public static void main(String[] args) {
        DuplicateCharactersAndNumbersInAString obj = new DuplicateCharactersAndNumbersInAString();
        obj.DuplicateCharacters();
    }
}
