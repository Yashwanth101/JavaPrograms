package programs;

public class PalindromeWithNumberAndString{

    int num = 545;
    int r;
    int sum = 0;

    public void PalindromeWithNumber(){
        int temp = num;
        while(num>0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if(temp == sum){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

     String name = "Liril";
     String temp = "";

    public void PalindromeWithString(){
        for(int i=name.length()-1;i>=0;i--){
            temp = temp+name.charAt(i);
        }

        if(name.equalsIgnoreCase(temp)){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeWithNumberAndString obj = new PalindromeWithNumberAndString();
        obj.PalindromeWithNumber();
        obj.PalindromeWithString();
    }



}



