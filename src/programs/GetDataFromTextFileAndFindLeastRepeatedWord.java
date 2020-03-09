package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GetDataFromTextFileAndFindLeastRepeatedWord {

    public String getData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ykamisetty\\IdeaProjects\\JavaPractise\\src\\programs\\SmallLines.txt"));
        String line = null;
        String word = "";
        while((line=br.readLine())!=null){
            word+=line;
        }
        br.close();
       return word;
    }

    public static void main(String[] args) throws IOException {

        GetDataFromTextFileAndFindLeastRepeatedWord obj = new GetDataFromTextFileAndFindLeastRepeatedWord();
        LinkedHashMap<String,Integer> hmap = new LinkedHashMap<>();
        String a = obj.getData();
        String b[] = a.split(" ");
        for(String x:b){
            Integer count = hmap.get(x);
            if(count==null){
                hmap.put(x,1);
            }else{
                hmap.put(x,++count);
            }

        }

       /* for(Map.Entry<String,Integer> mm:hmap.entrySet()){
            System.out.println(mm.getKey()+"------"+mm.getValue());
        }*/

        LinkedList<Integer> ll = new LinkedList<>(hmap.values());
        Collections.sort(ll);

        for(Map.Entry<String,Integer> mm:hmap.entrySet()){
                if (mm.getValue() == ll.getFirst()) {
                    System.out.println(mm.getKey());
                }else{

                }
            }
        }



       /* if(ll.getFirst()==h){

        }


*/









    }
