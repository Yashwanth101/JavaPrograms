package programs;

public class DivideStringInEqualParts {

    public void EqualParts(){

        String str = "abcdefghij";
        char ch[] = str.toCharArray();
        int length = str.length();
        int parts = length/5;
        String s;
        if(length%2!=0){
            System.out.println("Cannot Divide Into Equal Parts");
        }else{

            for(int i=0;i<5;i++){
                s = "";
                for(int j=(parts*i);j<(i+1)*parts;j++){
                    s = s+str.charAt(j);
                }
                System.out.println(s);

            }

        }

    }

    public static void main(String[] args) {
        DivideStringInEqualParts obj = new DivideStringInEqualParts();
        obj.EqualParts();
    }

}
