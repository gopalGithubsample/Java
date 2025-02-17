package com.wipro.java.tiktaktoe;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;
    private Scanner scanner; // Scanner as a class member

    public TicTacToe() {
        board = new char[3][3];
        scanner = new Scanner(System.in); // Initialize Scanner
        
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void play() {
        while (true) { // Outer loop for game replay
            initializeBoard();
            currentPlayer = 'X';

            while (true) { // Inner loop for a single game
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter your move (row and column, e.g., 0 1):");

                int row = -1, col = -1;
                try {
                    row = scanner.nextInt();
                    col = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                    System.out.println("Invalid move. Try again.");
                    continue;
                   
                }
                board[row][col] = currentPlayer;

                if (checkForWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a tie!");
                    break;
                }

                switchPlayer();
            } // End of inner loop (single game)

            System.out.println("Do you want to play again? (yes/no):");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break; // Exit the outer loop
            }
        } // End of outer loop (game replay)

        scanner.close(); // Close the scanner when don
        }
    
    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private boolean checkForWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}