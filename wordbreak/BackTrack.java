package wordbreak;

import java.util.HashSet;

public class BackTrack {
    public boolean wordBreak(String str, HashSet<String> dictionary) {
        return wordBreak(str, dictionary, 0);
    }

    private boolean wordBreak(String str, HashSet<String> dictionary ,int start) {
        if (start == str.length()) {
            return true;
        }
        for (int end = start+1; end <= str.length(); end++) {
            String prefix = str.substring(start, end);
            if (dictionary.contains(prefix) && wordBreak(str, dictionary, end)) {
                return true;
            }
        }
        return false;
    }
}
