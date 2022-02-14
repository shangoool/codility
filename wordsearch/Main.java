package wordsearch;

public class Main {
    public static void main (String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        BackTrack bt = new BackTrack();
        System.out.println(bt.exist(board, word));
    }
}
