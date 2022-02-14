package wordbreak;

import java.util.HashSet;

public class DP {
    public boolean wordBreak(String str, HashSet<String> dictionary) {
        boolean[] dp = new boolean[str.length()+1];
        dp[0] = true;
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] == true) {
                    String sub = str.substring(j,i);
                    if (dictionary.contains(sub)) {
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[str.length()];
    }
}
