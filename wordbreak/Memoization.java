package wordbreak;

import java.util.HashSet;

public class Memoization {
    public boolean wordBreak(String str, HashSet<String> dictionary) {
        return wordBreak(str, dictionary, 0, new Boolean[str.length()]);
    }

    private boolean wordBreak(String str, HashSet<String> dictionary ,int start, Boolean[] memo) {
        if (start == str.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start+1; end <= str.length(); end++) {
            String prefix = str.substring(start, end);
            if (dictionary.contains(prefix) && wordBreak(str, dictionary, end, memo)) {
                memo[start] = true;
                return true;
            }
        }
        memo[start] = false;
        return false;
    }
}
