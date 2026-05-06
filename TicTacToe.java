public class TicTacToe {

    // 3x3 board initialized with empty spaces
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // test case
    }

    /**
     * Checks if the move is inside the board and the cell is empty
     */
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0 to 2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }
}