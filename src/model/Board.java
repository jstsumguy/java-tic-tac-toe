/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willredington
 */
public class Board {
    
    private Cell [][] cells;
    private int size;
    
    public Board(int size) {
        assert size != 0;
        this.size = size;
        cells = new Cell [size][size];
        for(int row=0; row < size; row++) {
            for(int col=0; col < size; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }
    
    public Cell get(int row, int col) {
        try {
            Cell c = this.cells[row][col];
            return c;
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
        return null;
    }
    
    public void clear() {
        int size = this.size;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.cells[row][col] = new Cell(row, col);
            }
        }
    }
    
    public Cell [][] getBoard() { return this.cells; }
    public int getSize() { return this.size; }
}
