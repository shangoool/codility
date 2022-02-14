package longeststringchain;

import java.util.*;

public class Memoization {
    public int longestStringChainLength(String[] words) {
        Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> memo = new HashMap<>();
        int max = 0;
        for (String word : words) {
            max = Math.max(max, backTrack(dictionary, word, memo));
        }
        return max;
    }

    private int backTrack(Set<String> dictionary, String word, Map<String, Integer> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        int maxLen = 1;
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            String newWord = sb.deleteCharAt(i).toString();
            if (dictionary.contains(newWord)) {
                int len = 1 + backTrack(dictionary, newWord, memo);
                maxLen = Math.max(len, maxLen);
            }
            sb.insert(i, word.charAt(i));
        }
        memo.put(word, maxLen);
        return maxLen;
    }
}
