package braceexpansion;

public class Main {
    public static void main (String[] args) {
        String word = "{a,b}c{d,e}f";
        Recursion recurse = new Recursion();
        for (String str: recurse.expand(word)) {
            System.out.println(str);
        }
    }
}
