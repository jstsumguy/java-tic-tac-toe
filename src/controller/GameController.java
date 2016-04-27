/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;
import view.GameView;

/**
 *
 * @author willredington
 */
public class GameController {
    private final Game game;
    private final GameView view;
    private final BoardController bc;
    
    public GameController(Game g, GameView v, BoardController bc) {
        this.game = g;
        this.view = v;
        this.bc = bc;
    }
    
    public void start() {
       if(view.showMenu()) {
           Player [] players = this.initPlayers();
           view.showStatus(game, players);
           boolean winner = false;
           
           while(!winner) {
               winner = this.bc.checkForWin(players[0]) || this.bc.checkForWin(players[1]);
               this.processTurn(players[this.game.getCurrentPlayer()]);
           }
       }
    }
    
    public void processTurn(Player p) {
        Cell choice = this.bc.nextTurn(p);
        if(this.bc.move(choice.getRow(), choice.getCol(), p)) {
            this.game.next();
        }
        else { processTurn(p); }
    }
    
    public Player [] initPlayers() {
        Player [] players = new Player[2];
        players[0] = new Player(PlayerType.X);
        players[1] = new Player(PlayerType.O);
        return players;
    }
}
