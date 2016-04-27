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
public class Game {
   
    private int counter;
    private final Player [] players;
    private int currentPlayer = -1;
    
    public Game(final Player [] p) {
        this.counter = 0;
        this.players = p;
        this.currentPlayer = 0;
    }
    
    public void next() {
        this.currentPlayer = (this.currentPlayer > 0) ? 0 : 1;
        this.incrementCount();
    }
    
    public void setCurrentPlayer(int n) { this.currentPlayer = n; }
    public int getCurrentPlayer() { return this.currentPlayer; }
    public void incrementCount() { this.counter += 1; }
    public int getMoves() { return this.counter; }
    public Player [] getPlayers() {
        return this.players;
    }
}
