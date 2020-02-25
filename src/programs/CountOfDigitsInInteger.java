package programs;

public class CountOfDigitsInInteger {

    public static void main(String[] args) {
        int s = 222222200;
        int count = 0;

        while(s>0){

            count++;
            s = s/10;

        }

        System.out.println(count);


    }




}
