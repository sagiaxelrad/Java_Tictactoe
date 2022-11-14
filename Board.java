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
        String resault = "";
        //test collumns
        for(int l=0; l<3; l++){
            if((board[1][l]==board[2][l])&&(board[2][l]==board[3][l])&&(board[1][l]!=0)){
                    resault = "you won";
                }}
        //test row
        for(int m=0; m<3; m++){
            if((board[m][1]==board[m][2])&&(board[m][2]==board[m][3])&&(board[m][1]!=0)){
                    resault = "you won";
                }}
        //test diagnal
        if((board[1][1]==board[2][2])&&(board[2][2]==board[3][3])&&(board[1][1]!=0)){
                resault = "you won";
            }
        if((board[1][3]==board[2][2])&&(board[2][2]==board[3][1])&&(board[1][3]!=0)){
            resault = "you won";
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