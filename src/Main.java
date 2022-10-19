import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        Scanner input = new Scanner(System.in);

        while (!game.isGameOver()) {
            System.out.println("Who are you? ('x' or 'o'): ");
            String playerStr = input.next();
            char player = playerStr.charAt(0);
            System.out.println("Enter move row (0-2): ");
            int row = input.nextInt();
            System.out.println("Enter move column (0-2): ");
            int column = input.nextInt();
            game.playAMove(player, row, column);
        }

        System.out.println("Congratulations " +game.whoIsTheWinner());

        game.isGameOver(); // true/false
        game.whoIsTheWinner();

        System.out.println(game);
        System.out.print(game.isGameOver());





    }
}
