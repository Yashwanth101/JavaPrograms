package programs;

import java.util.LinkedList;

public class ConvertDecimalToBinary {
    int num= 153;
    int r;

    public void BinaryCode(){
        LinkedList<Integer> ll = new LinkedList<>();
        while(num>0) {
           r = num % 2;
           ll.add(r);
           num = num / 2;
       }

        for (int a:
             ll) {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        ConvertDecimalToBinary obj = new ConvertDecimalToBinary();
        obj.BinaryCode();
    }

}
