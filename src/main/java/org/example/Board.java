package org.example;


import java.util.ArrayList;
import java.util.List;

/**
 * Connect 4 game board
 * Handles Grid state
 */

public class Board {
    private final List<List<Piece>> columns;

    private final int rows;

    public Board(int columns, int rows){
        this.rows = rows;
        this.columns = new ArrayList<>();

        for(int i = 0; i < columns; i++){
            this.columns.add(new ArrayList<>());
        }
    }

    public int getRows(){
        return rows;
    }
}
