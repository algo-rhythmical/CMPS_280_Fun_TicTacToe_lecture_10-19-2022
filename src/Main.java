import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        Scanner input = new Scanner(System.in);

        System.out.print("Who are you? ('x' or 'o'): ");
        String playerStr = input.next();
        char player = playerStr.charAt(0);
        System.out.println(game+"\n");
        System.out.print("Enter move row (0-2): ");
        int row = input.nextInt();
        System.out.print("Enter move column (0-2): ");
        int column = input.nextInt();
        System.out.println(game);
        game.playFirstMove(player, row, column);

        while (!game.isGameOver()) {

            System.out.println("Next player:\nEnter move row(0-2): ");
            row = input.nextInt();
            System.out.print("Enter move column (0-2): ");
            column = input.nextInt();
            game.playNextMove(game.getNextPlayer(), row, column);
        }

        System.out.println("Congratulations player " +game.getWinner()+ "! You win!");

        System.out.println(game);
        System.out.print("Game is over");





    }
}
