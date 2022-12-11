import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String a[]){
        String str ="stress";
        List<String> stringList= Arrays.asList(str);
        System.out.println(stringList);
     Stream.of(str.toCharArray()).filter(chars -> str.indexOf(String.valueOf(chars)) ==  str.lastIndexOf(String.valueOf(chars))).collect(Collectors.toList());
       /*for(Character ch: str.toCharArray() ){
           if
       }*/
        //System.out.println(ch);
    }

}
