package programs;

import java.util.Collections;
import java.util.LinkedList;

public class ConsecutiveNumberOf1sInArray {

    int a[]={0,0,1,1,0,1,1,1,0,0}; // count = 3 //Highest Number of the Consecutive 1s

    public void ConsecutiveNumbers(){
        LinkedList<Integer> ll = new LinkedList<>();
        int count = 0;
        for(int i=0;i<a.length;i++){

            if (a[i]==1){
                count++;
            }else {
                if(count==0){

                }
                else {

                    ll.add(count);
                    count=0;
                }
            }
        }

        Collections.sort(ll);

        System.out.println(ll.getLast());


    }

    public static void main(String[] args) {
        ConsecutiveNumberOf1sInArray obj = new ConsecutiveNumberOf1sInArray();
            obj.ConsecutiveNumbers();

    }
}
