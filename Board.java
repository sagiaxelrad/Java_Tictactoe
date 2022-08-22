
public class Board {
    private int[][] board;
    int k = 10;
    int c = 6;

    public Board() {
        // create a new board

        this.board = new int[k][c];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                sb.append("[");

                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}