package wordbreak;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main (String[] args) {
        HashSet<String> dictionary = new HashSet<>(Arrays.asList(new String[] { "cats","dog","sand","and","cat"}));
        String input = "catsandog";
        Memoization memo = new Memoization();
        System.out.println(memo.wordBreak(input, dictionary));
    }
}
