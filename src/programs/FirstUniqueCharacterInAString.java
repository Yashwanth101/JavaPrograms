package programs;



import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public char FirstUniqueCharacter(){
        char x=' ';
        String str = "tttae";
        LinkedHashMap<Character,Integer> hmap = new LinkedHashMap<>();
        char ch[] = str.toCharArray();
        for(char q:ch){
            Integer count = hmap.get(q);

            if(count==null){
                hmap.put(q,1);
            }
            else{
                hmap.put(q,++count);
            }
        }
        System.out.println(hmap);
        for(Map.Entry<Character,Integer> a:hmap.entrySet()){
            if(a.getValue()== 1){
                x = a.getKey();
                return x;
            }
        }
        return x;
    }

    public static void main(String[] args) {

        FirstUniqueCharacterInAString obj  = new FirstUniqueCharacterInAString();
        System.out.println(obj.FirstUniqueCharacter());

    }
}
