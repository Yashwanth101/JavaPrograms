package programs;

public class ArmstrongNumber {
    //Sum of the Cubes of the Integer

    int num = 153;
    int r;
    int sum;
    int temp = num;
    public void ArmstrongNumber(){

        while(num>0){
             r = num%10;
             sum = sum+(r*r*r);
             num = num/10;

        }

        if(temp==sum){
            System.out.println("It's Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }


    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.ArmstrongNumber();
    }
}
