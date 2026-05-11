package org.example;

import java.util.Objects;

public class Main {

    /** Global variable **/
    String[][] board;
    Boolean winner;
    Boolean draw;
    int winningPlayer;
    int playerTurn;

    /**
     * Constructor
     */
    public Main(){
        winningPlayer= 0;
        draw = false;
        playerTurn = 1;
        board = new String[6][7];
        newBoard();
        displayBoard();
    }

    /**
     * Making the board template/design in the console
     */
    private void newBoard(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                board[i][j] = " - ";
            }
        }
    }

    /**
     * Display the board
     */
    private void displayBoard(){
        System.out.println(" ");
        System.out.println(" THIS IS CONNECT 4!!!");
        System.out.println(" ");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Validate user input
     * @param input from user
     * @return true if valid - otherwise false
     */
    private boolean validInput(String input){
        return ((Objects.equals(input, "1") ||
                Objects.equals(input, "2") ||
                Objects.equals(input, "3") ||
                Objects.equals(input, "4") ||
                Objects.equals(input, "5") ||
                Objects.equals(input, "6") ||
                Objects.equals(input, "7")));
    }

    /**
     * Check to see if column is full
     * @param column bad user input
     * @return true if the column is full
     */
    private boolean isColumnFull(int column){
        return (board[0][column-1] == " X " || board[0][column-1] == " 0 ");
    }

    /**
     * Get the next free slot
     * @param column
     * @return the next free row of a set column
     */
    private int getNextFreeSlot(int column){
        int position = 5;
        boolean found = false;
        while (position >= 0 && !found){
            if (!Objects.equals(board[position][column], " X") && !Objects.equals(board[position][column],
                    " 0 " )){
                found = true;
            } else {
                position--;
            }
        }
        return position;
    }

    private void swwapPlayerTurn(){
        if (playerTurn ==  1 ){
            playerTurn = 2;
        } else {
            playerTurn = 1;
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main con4 = new Main();
    }
}