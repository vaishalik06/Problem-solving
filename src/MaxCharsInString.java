import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCharsInString {

    public static char getMaxOccurence(String name) {
        char[] strArray = name.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch : strArray) {
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }

        }
        System.out.println(characterIntegerMap);
        int max = Collections.max(characterIntegerMap.values());
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            if (entry.getValue() == max) {
                return (entry.getKey());
            }
        }
        return '0';
    }

    public static void main(String args[]) {
        String name = "test in javat";
        char result = getMaxOccurence(name);
        System.out.println("Max occurred character is : " + result);
    }
}
