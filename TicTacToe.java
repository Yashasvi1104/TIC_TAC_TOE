import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();

        // 0 → Human, 1 → Computer
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first with symbol: " + humanSymbol);
            System.out.println("Computer plays with symbol: " + computerSymbol);
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first with symbol: " + computerSymbol);
            System.out.println("Human plays with symbol: " + humanSymbol);
        }
    }
}