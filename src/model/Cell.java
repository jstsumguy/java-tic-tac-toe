/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author willredington
 */
public class Cell {
    
    private int row;
    private int col;
    private PlayerType type;
    
    public Cell(int row, int col, PlayerType t) {
        this.row = row;
        this.col = col;
        this.type = t;
    }
    
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.type = null;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }
    /**
     * @return the type
     */
    public PlayerType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(PlayerType type) {
        this.type = type;
    }
    
    
    
}
