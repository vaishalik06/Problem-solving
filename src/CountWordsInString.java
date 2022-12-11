import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Hello java java world";
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }

        }
        System.out.println(wordsMap);
    }

}
