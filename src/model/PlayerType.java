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
public enum PlayerType { 
    X("X"), O("O"); 
    
    private final String symbol;
    
    PlayerType(String s) {
        this.symbol = s;
    }
    
    @Override
    public String toString() { return this.symbol; }
}
