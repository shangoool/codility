package braceexpansion;
import java.util.*;

public class Recursion {
    public String[] expand(String str) {
        Set<String> set = new TreeSet<>();
        helper(str, set, new StringBuilder(), 0);
        String[] result = new String[set.size()];
        result = set.toArray(result);
        return result;
    }

    private void helper(String str, Set<String> result, StringBuilder comb, int index) {
        if (index == str.length()) {
            result.add(comb.toString());
        }
        else if (str.charAt(index) == '{') {
            List<Character> options = new ArrayList<>();
            index++;
            while (str.charAt(index) != '}') {
                if (str.charAt(index) != ',') {
                    options.add(str.charAt(index));
                }
                index++;
            }
            for (char c : options) {
                helper(str, result, new StringBuilder(comb).append(c), index+1);
            }
        }
        else {
            comb.append(str.charAt(index));
            helper(str, result, comb, index+1);
        }
    }
}
