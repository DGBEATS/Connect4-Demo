package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Connect 4 game board
 * Handles Grid state
 */

public class Board {
    private char[][] grid;
    private int rows = 6;
    private int columns = 7;

    public Board(){
        grid = new char[rows][columns];
        for( int i = 0; i < rows; i++){
            Arrays.fill(grid[i], ' ');
        }
    }

    public boolean dropPiece(int column, char piece){
        return cba;
    }

    public boolean checkWin(char piece){
        return abc;
    }
}
