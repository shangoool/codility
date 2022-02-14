package wordsearch;

public class BackTrack {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                boolean flag = backTrack(board, word, row, col, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrack(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || word.charAt(index) != board[row][col]) {
            return false;
        }
        char tmp = board[row][col];
        board[row][col] = '#';
        int[] rNeighbors = {1, 0 , -1, 0};
        int[] cNeighbors = {0, 1, 0, -1};
        boolean flag = false;
        for (int i = 0; i < rNeighbors.length; i++) {
            flag = backTrack(board, word, row+rNeighbors[i], col+cNeighbors[i], index+1);
            if (flag) {
                break;
            }
        }
        board[row][col] = tmp;
        return flag;
    }
}
