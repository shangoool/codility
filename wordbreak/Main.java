package wordbreak;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main (String[] args) {
        HashSet<String> dictionary = new HashSet<>(Arrays.asList(new String[] { "cats","dog","sand","and","cat"}));
        String input = "catsandog";
        BackTrack bt = new BackTrack();
        System.out.println(bt.wordBreak(input, dictionary));
    }
}
