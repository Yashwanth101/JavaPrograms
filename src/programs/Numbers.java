package programs;

public class Numbers {

    /*
     * Reverse a Array and Print the stars
     * Eg = {1,2,3,4}
     * Reversed Array = {4,3,2,1}
     * Output
     * $$$$321
     * $$$$$$$21
     * $$$$$$$$$1
     * $$$$$$$$$$
     */

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int b[] = new int[a.length];
        int x = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[x] = a[i];
            x++;
        }

        // System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            int sum = 0;

            for (int j = 0; j <= i; j++) {
                sum = sum + b[j];
            }

            for (int k = 0; k < sum; k++) {
                System.out.print("*");
            }

            for (int h = 1; h < b[i]; h++) {
                System.out.print(b[h]);
            }
            System.out.println();

        }

    }


}
