package programs;

import java.util.Arrays;

public class BubbleSort {

    public void Sort(int a[]){

        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<a.length-i-1;j++){

                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }

            }

        }

    }



    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int a[] = {1,2,3,4,1,2,3,4};
        b.Sort(a);
        System.out.println(Arrays.toString(a));
    }
}
