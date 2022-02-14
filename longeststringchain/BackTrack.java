package longeststringchain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BackTrack {
    public int longestStringChainLength(String[] words) {
        Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        int max = 0;
        for (String word : words) {
            max = Math.max(max, backTrack(dictionary, word));
        }
        return max;
    }

    private int backTrack(Set<String> dictionary, String word) {
        int maxLen = 1;
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            String newWord = sb.deleteCharAt(i).toString();
            if (dictionary.contains(newWord)) {
                int len = 1 + backTrack(dictionary, newWord);
                maxLen = Math.max(len, maxLen);
            }
            sb.insert(i, word.charAt(i));
        }
        return maxLen;
    }
}
