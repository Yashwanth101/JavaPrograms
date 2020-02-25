package programs;

public class SmallestAndLargestNumberInArray {
    int a[] = {10,20,5,60,7};
    int min = a[0];

    public int smallestNumber(){
        for(int i=0;i<a.length;i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    int max = a[0];

    public int largestNumber(){
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        SmallestAndLargestNumberInArray obj = new SmallestAndLargestNumberInArray();
        System.out.println(obj.smallestNumber());
        System.out.println(obj.largestNumber());



    }


}
