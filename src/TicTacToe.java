public class TicTacToe {
    private char[][] board;
    private char nextPlayer;
    private char winner;

    TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        nextPlayer = 'x';
    }

    public void playAMove(char symbol, int row, int column) {
        if (symbol == nextPlayer && !isGameOver()) {
            if(row >= 0 && row <=2 && column >=0 && column <=2) {
                if (board[row][column] != 'o' & board[row][column] != 'o') {
                    board[row][column] = symbol;
                    if (nextPlayer == 'x') {
                        nextPlayer = 'o';
                    }
                    else nextPlayer = 'x';
                }
            }
        }

    }

    public boolean isGameOver() {
        boolean over = false;
        //check rows
        for (int i = 0; i < board.length; i ++) {
            if(board[i][0] == board[i][1] && board [i][0] == board[i][2] && board[i][0] != ' ') {
                over = true;
                break;
            }
        }

        //check columns
        for (int i = 0; i < board.length; i ++) {
            if(board[0][i] == board[1][i] && board [0][i] == board[2][i] && board[0][i] != ' ') {
                over = true;
                break;
            }
        }

        //check diagonals


        return over;
    }

    public void getWinner() {
        return winner;
    }

    public String toString() {
        return  "Game board: \n" +
                board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"\n" +
                "-----\n" +
                board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"\n" +
                "-----\n" +
                board[2][0]+"|"+board[2][1]+"|"+board[2][2];
    }
}
