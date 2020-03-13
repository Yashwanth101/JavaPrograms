package programs;

public class ReplaceWithSpecialCharactersOnReversedArray {

    /*
            Input = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}
            output should be
            1234**4321
            123****321
            12******21
            1********1
            **********
     */

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int x = a.length / 2;
        int g = x - 1;
        int a1[] = new int[x];
        int a2[] = new int[x];
        int j = 0;

        for (int i = 0; i < a.length; i++) {

            if (i <= g) {
                a1[i] = a[i];
            } else {
                a2[j] = a[i];
                j++;
            }

        }

        int h = 0;
        int i = 0;

        for (int w = 0; w < x; w++) {
            int y = 0;

            for (i = 0; i < a1.length; i++) {

                if (i >= g) {
                    System.out.print("*");
                    if (y == 0) {
                        g--;
                        y++;
                    }

                } else {
                    System.out.print(a1[i]);
                }

            }

            for (int k = 0; k < a2.length; k++) {
                if (k <= h) {
                    System.out.print("*");

                } else {
                    System.out.print(a2[k]);
                }
            }

            h++;
            System.out.println();

        }
    }
}
