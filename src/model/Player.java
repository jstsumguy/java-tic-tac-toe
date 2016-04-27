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
public class Player {
    
    private final PlayerType type;
    private int wins;
    private int loses;
    
    public Player(final PlayerType t) {
        this.type = t;
        this.wins = 0;
        this.loses = 0;
    }
    
    public void addWin() { this.wins += 1; }
    public void addLose() { this.loses += 1; }
    
    public PlayerType getPlayerType() { return this.type; }
    public int getWins() { return this.wins; }
    public int getLoses() { return this.loses; }
}
