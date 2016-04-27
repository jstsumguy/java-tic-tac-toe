/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.*;

/**
 *
 * @author willredington
 */
public class BoardView {
    
    public void printBoard(Board board) {
        int size = board.getSize();
        for(int row=0; row < size; row++) {
            String line = "";
            for(int col=0; col < size; col++) {
                String cellstr = "";
                Cell cell = board.get(row, col);
                String symbol = (cell.getType() != null) ? cell.getType().toString() : "_";
                if(col == 0) {
                    cellstr += "_" + symbol;
                }
                else if (col == (size - 1)) {
                    cellstr += symbol + "_";
                }
                else {
                    cellstr += "_|" + symbol + "|_";
                }
                line += cellstr;
            }
            System.out.println(line);
        }
    }
    
    public void printScore(Player [] players) {
        Player winner = null;
        int max_wins = 0;
        for(Player p : players) {
            if(p.getWins() > max_wins)
                winner = p;
        }
        System.out.println("Winner: " + winner.getPlayerType().toString() + " won with " + Integer.toString(max_wins) + " wins.");
    }
    
    public void printErr(String msg) { System.out.println(msg); }
    
    public Cell getNextMove(Player p, Board b) {
        System.out.println("Enter next move");
        System.out.println("Choose row: ");
        
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        
        System.out.println("Enter column: ");
        int col = in.nextInt();
        Cell pos = b.get(row, col);
        return pos;
    }
    
}
