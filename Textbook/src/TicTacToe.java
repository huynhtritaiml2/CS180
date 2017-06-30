/**
 * Created by Bruce on 11/3/16.
 */
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        boolean turn = true;
        boolean gameOver = false;
        int row, column, moves = 0;
        char shape;
    while(!gameOver) {
        if (turn)
            shape = 'X';
        else
            shape = 'O';
        System.out.print(shape + "'s turn" + "\nEnter row (0-2): ");
        row = s.nextInt();
        System.out.print("Enter column (0-2): ");
        column = s.nextInt();
        if (board[row][column] != ' ') {
            System.out.println("Illegal move");
        } else {
            board[row][column] =  shape;
            moves++;
            turn = !turn;
            System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
            System.out.println("-------");
            System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
            System.out.println("-------");
            System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == shape && board[i][1] == shape && board[i][2] == shape) {
                gameOver = true;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == shape && board[1][i] == shape && board[2][i] == shape) {
                gameOver = true;
            }
        }

        if (board[0][0] == shape && board[1][1] == shape && board[2][2] == shape) {
            gameOver = true;
        }

        if (board[0][2] == shape && board[1][1] == shape && board[2][0] == shape) {
            gameOver = true;
        }

        if (gameOver) {
            System.out.println(shape + " wins!");
        }

        else if (moves == 9) {
            gameOver = true;
            System.out.println("Tie!");
        }

        }
    }
}
