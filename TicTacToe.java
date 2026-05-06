import java.util.Random;

public class TicTacToe {

    // Initialize empty board
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char computerSymbol = 'O';

    /**
     * Entry point of the program
     */
    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    /**
     * Generates random valid move and places symbol
     */
    static void computerMove() {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1; // 1 to 9

            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // UC4 logic
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5 logic
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    // Display board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }
}