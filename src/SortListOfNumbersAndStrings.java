import java.util.*;

public class SortListOfNumbersAndStrings{
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List numList = new ArrayList<>();
        List strList = new ArrayList<>();
        list.add(123);
        list.add("abc");
        list.add(321);
        list.add("feg");
        list.add(null);
        List res = new ArrayList();


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                numList.add(list.get(i));
            }
            if (list.get(i) instanceof String) {
                strList.add(list.get(i));
            }
        }
        Collections.sort(numList);
        Collections.sort(strList);
        numList.addAll(strList);
        System.out.println(numList);
    }

    /*@Override
    public int compareTo(SortListOfNumbersAndStrings o) {
        return (o.compareTo(o));
    }*/
}
