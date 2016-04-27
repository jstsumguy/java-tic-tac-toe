/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Game;
import model.Player;
import model.PlayerType;
import model.Cell;

/**
 *
 * @author willredington
 */
public class GameView {
    
    public boolean showMenu() {
        System.out.println("-----Tic Tac Toe-----");
        System.out.println("1) Start");
        System.out.println("2) About");
        System.out.println("3) Quit");
        
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch(input) {
            case(1):
                System.out.println("Starting new game...");
                return true;
            case(2):
                System.out.println("Created by Will Redington");
                showMenu();
            case(3):
                System.exit(0);
            
        }
        return false;
    }
    
    public void showStatus(Game g, Player [] players) {
        System.out.println("Moves: " + g.getMoves());
        for(Player p : players) {
            System.out.println("Player " + p.getPlayerType().toString() + " has " + p.getWins() + " wins.");
        }
    }
    
}
