import java.util.Random;
import java.util.Scanner;

public class Tetris {
    static final int BOARD_WIDTH = 10;
    static final int BOARD_HEIGHT = 20;
    static final char EMPTY = '-';
    static final char BLOCK = '#';

    static char[][] board = new char[BOARD_HEIGHT][BOARD_WIDTH];
    static Random rand = new Random();

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        board[0][8] = BLOCK;

        while (gameRunning) {
            // Handle user input (e.g., left, right, down, quit)
            System.out.println("Enter a command (a=left, d=right, s=down, q=quit): ");
            
            char move = 0;//scanner.next().charAt(0);

            if (move == 'q') {
                gameRunning = false;
                break;
            }

            // Move the current Tetrimino based on user input
            // (for simplicity, you can just handle left/right movement for now)
            moveTetrimino(move);

            clearScreen();

            // Update and render the board
            printBoard();

            // Simulate falling Tetrimino
            simulateFallingTetrimino();

            // Check for line clearance and game over
            clearLines();
            gameRunning = !checkGameOver();
            try { Thread.sleep(100); } catch (Exception e) {}
        }

        System.out.println("Game Over!");
        scanner.close();
    }

    public static void initializeBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.print(board[i][j]);
            } 
            System.out.println();
        }
    }

    // Simulate a falling block (for now, just place a block at the top)
    public static void simulateFallingTetrimino() {
        for (int i = BOARD_HEIGHT - 1; i > 0; i--) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (board[i - 1][j] == BLOCK) {
                    board[i][j] = BLOCK;
                    board[i - 1][j] = EMPTY;
                }
            }
        }
    }

    // Handle the movement of a tetrimino (left, right, down)
    public static void moveTetrimino(char direction) {
        // For simplicity, move a "block" (just a single #) left or right
        // In a more complex version, you could have rotations and shapes
        for (int j = 0; j < BOARD_WIDTH; j++) {
            if (board[0][j] == BLOCK) {
                if (direction == 'a' && j > 0) {
                    board[0][j - 1] = BLOCK;
                    board[0][j] = EMPTY;
                } else if (direction == 'd' && j < BOARD_WIDTH - 1) {
                    board[0][j + 1] = BLOCK;
                    board[0][j] = EMPTY;
                }
            }
        }
    }

    // Check if the game is over (when a block reaches the top)
    public static boolean checkGameOver() {
        for (int j = 0; j < BOARD_WIDTH; j++) {
            if (board[0][j] == BLOCK) {
                return true;
            }
        }
        return false;
    }

    // Check for and clear filled lines
    public static void clearLines() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            boolean lineFull = true;
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (board[i][j] == EMPTY) {
                    lineFull = false;
                    break;
                }
            }

            if (lineFull) {
                // Clear the line
                for (int k = i; k > 0; k--) {
                    for (int j = 0; j < BOARD_WIDTH; j++) {
                        board[k][j] = board[k - 1][j];
                    }
                }
                // Empty the top line
                for (int j = 0; j < BOARD_WIDTH; j++) {
                    board[0][j] = EMPTY;
                }
            }
        }
    }
}
