package org.example;

import java.util.*;

public class TicTacToe {

    private static final int INPUT_SIZE = 2;
    private static final String PLAYER_X = " X";
    private static final int ZERO_BOARD = 0;
    private static final String BOT_O = " 0";
    private static final String X_WON = "You won";
    private static final String O_WON = "Bot won";
    private static final String GAME_CONTINUE = "Game to continue";
    private static int ROW_BOARD = 3;
    private static int COL_BOARD = 3;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        while (true) {
            startGameRound();
        }
    }

    private static void startGameRound() {
        System.out.println("Let's play");
        String[][] board = createBoard();
        startGameLoop(board);
    }

    private static void startGameLoop(String[][] board) {
        while (true) {

            makePlayerMove(board);
            printBoard(board);
            makeBotMove(board);
            printBoard(board);
            if (calculateScore(board) != GAME_CONTINUE) {
                System.out.println(calculateScore(board));
                return;
            }
            ;

        }
    }

    private static String[][] createBoard() {
        String[][] board = new String[ROW_BOARD][COL_BOARD];
        return board;
    }

    private static int[] readInput() {
        System.out.println("Enter your move cells: ");
        int[] playerMoveCell = new int[INPUT_SIZE];
        for (int inputElement = 0; inputElement < INPUT_SIZE; inputElement++) {
            if (scanner.hasNext()) {
                playerMoveCell[inputElement] = scanner.nextInt();
            }
        }
        return playerMoveCell;
    }

    private static String[][] makePlayerMove(String[][] board) {
        int[] input = readInput();
        board[input[0]][input[1]] = PLAYER_X;
        return board;

    }

    private static String[][] makeBotMove(String[][] board) {
        System.out.println("Bot makes move");

        do {
            int[] inputBot = new int[INPUT_SIZE];
            inputBot[0] = random.nextInt(ROW_BOARD - ZERO_BOARD) + ZERO_BOARD;
            inputBot[1] = random.nextInt(ROW_BOARD - ZERO_BOARD) + ZERO_BOARD;
            if (board[inputBot[0]][inputBot[1]] == null) {
                board[inputBot[0]][inputBot[1]] = BOT_O;
                return board;
            }

        } while (true);
    }

    public static void printBoard(String[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < ROW_BOARD; row++) {
            for (int col = 0; col < COL_BOARD; col++) {
                if (board[row][col] == null) {
                    System.out.print("  |");
                } else {
                    System.out.print(board[row][col] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static String calculateScore(String[][] board) {
        List<Integer> scoreList = new ArrayList<>();


        for (int row = 0; row < ROW_BOARD; row++) {
            int sumRow = 0;
            for (int col = 0; col < COL_BOARD; col++) {
                sumRow += keyValueScore(board[row][col]);
            }
            scoreList.add(sumRow);
        }


        for (int col = 0; col < COL_BOARD; col++) {
            int sumCol = 0;
            for (int row = 0; row < ROW_BOARD; row++) {
                sumCol += keyValueScore(board[row][col]);

            }
            scoreList.add(sumCol);
        }

        int sumDiagRight = 0;
        for (int diagCellRow = 0; diagCellRow < COL_BOARD; diagCellRow++) {

            int diagCellCol = COL_BOARD - diagCellRow - 1;
            sumDiagRight += keyValueScore(board[diagCellRow][diagCellCol]);


        }
        scoreList.add(sumDiagRight);
        int sumDiagLeft = 0;
        for (int diagCellCol = 0; diagCellCol < ROW_BOARD; diagCellCol++) {
            int diagCellRow = ROW_BOARD - diagCellCol - 1;
            sumDiagLeft += keyValueScore(board[diagCellRow][diagCellCol]);
        }
        scoreList.add(sumDiagLeft);

        if (scoreList.contains(3)) {
            return X_WON;
        } else if (scoreList.contains(-3)) {
            return O_WON;
        } else return GAME_CONTINUE;
    }

    public static int keyValueScore(String board) {
        if (board == PLAYER_X) {
            return 1;
        } else if (board == BOT_O) {
            return -1;
        } else return 0;
    }
}
