public class Board {
    public int[][] board;
    int k = 4;
    int c = 4;
    public Board() {
        // creates a new board
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
    //test if somebody won
    
    public String testwin(){
       String resault="";
       for(int r=1; r<k; r++){
        for(int h=1; h<c; h++){
            if(h+2<c){
            if(board[r][h]==board[r][h+1]&&board[r][h]==board[r][h+2]&&board[r][h]!=0){
                resault="you won";
            }}
            if(r+2<k){
            if(board[r][h]==board[r+1][h]&&board[r][h]==board[r+2][h]&&board[r][h]!=0){
                resault="you won";
            }}
            if(r+2<k&&h+2<c){
            if(board[r][h]==board[r+1][h+1]&&board[r][h]==board[r+2][h+2]&&board[r][h]!=0){
                resault="you won";
            }}
            if(h-2>0&&r+2<c){
            if(board[r][h]==board[r+1][h-1]&&board[r][h]==board[r+2][h-2]&&board[r][h]!=0){
                resault="you won";
            }
        }
       }
    }
    return resault;
    }
    //draw the board
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //lable collumns
        if(c>61){
            c = 61;
            }
        //convert lable to letters
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
        //draw the actual board
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
        sb.append(testwin());
        return sb.toString();
}
}