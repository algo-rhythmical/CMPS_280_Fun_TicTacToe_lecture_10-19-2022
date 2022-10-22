import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);

        //pick who wants to go first, 'x' or 'o' and plays first move. Automatic alternating of player: x and o
        System.out.println("\n"+game);
        System.out.print("First player, pick x or o: ");
        String playerStr = input.next();
        char player = playerStr.charAt(0);
        game.setNextPlayer(player);
        System.out.print("Enter move row (0-2): ");
        int row = input.nextInt();
        System.out.print("Enter move column (0-2): ");
        int column = input.nextInt();
        game.playNextMove(player, row, column);

        //While the game is not over, players alternate playing a move until a winner is declared.
        while (!game.isGameWon()) {
            System.out.println("\n"+game);
            System.out.print("Next player: "+ "'"+game.getNextPlayer()+"'"+"\nEnter move row(0-2): ");
            row = input.nextInt();
            System.out.print("Enter move column (0-2): ");
            column = input.nextInt();
            game.playNextMove(game.getNextPlayer(), row, column);
        }

        //Game is over, display results
        System.out.println("\n"+game);
        if (game.getWinner() == 't') {
            System.out.println("\n"+"We have a tie! Both players are winners and losers!");
        }
        else {
        System.out.println("\n"+"Congratulations player " +game.getWinner()+ "! You win!");
        }
        System.out.print("Game is over");

    }
}
