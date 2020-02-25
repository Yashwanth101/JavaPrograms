package programs;

public class FebnochiSeries {

    int a = 0;
    int b = 1;
    int sum;
    public void FebnochiSeries(){

        while (sum<100){
            sum = a+b;
            a = b;
            b = sum;

            System.out.print(sum+" ");
        }



    }

    public static void main(String[] args) {
        FebnochiSeries obj = new FebnochiSeries();
        System.out.print(obj.a +" "+ obj.b+" ");
        obj.FebnochiSeries();
    }

}
