package dsa_new.string_problems.anagram_group.optimize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {

    public static List<List<String>> groupAnagram(String[] input) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : input) {
            // System.err.println("words .. " + word);
            char[] chars = word.toCharArray();
            // System.err.println("chars .. " + Arrays.toString(chars));
            Arrays.sort(chars);
            // System.err.println("chars after sorted .. " + Arrays.toString(chars));
            // System.err.println("As string key: " + new String(chars));
            String key = new String(chars);
            System.err.println("key: " + key);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> output = groupAnagram(input);
        System.out.println("output is .. " + output);
    }
}
