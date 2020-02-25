package programs;

public class PrimeNumber {

    int num = 100;

    public void checkPrimeNumber(){

        for(int i=2;i<num;i++){
          int s = 0;
            for(int j = 2;j<i;j++){

                if(i%j==0){
                    s=1;
                    break;
                }

            }

            if(s==0){
                System.out.println(i);
            }

        }
    }


    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.checkPrimeNumber();
    }

}
