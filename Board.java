import java.util.*;

public class Board {
    private int[][] board;
    int k = 5;
    int c = 150;

    public Board() {
        // create a new board

        this.board = new int[k][c];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++){
                this.board[i][j] = 0;
            }
        }
    }
    //determine where to place symbols
    public void setCoordinate(int x, int y, int value) {
        this.board[x][y] = value;
    
    }
    //draw the 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(c>61){
            c = 61;
            }
        if(c<27){
        
        sb.append(" ");
        for (int l = 1; l<c; l++){
            sb.append(" ");
            String converted = Character.toString(l+96);
            sb.append(converted);
            sb.append(" ");
        }
        }
        else{
            sb.append(" ");
            for (int l = 1; l<c; l++){
                
                sb.append(" ");
                sb.append(l);
                if(l<10){
                sb.append(" ");}
        }
        }
        sb.append("\n");
        for (int i = 1; i < k; i++) {
            for (int j = 1; j < c; j++) {
                if (j==1){
                sb.append(i);}
                sb.append("[");
                switch (this.board[i][j]) {
                    case 0:
                        sb.append(" ");
                        break;
                    case 1:
                        sb.append("X");
                        break;
                    case 2:
                        sb.append("O");
                        break;
                }

                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}