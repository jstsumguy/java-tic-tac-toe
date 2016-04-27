/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Board;
import model.Cell;
import model.Player;
import model.PlayerType;
import view.BoardView;

public class BoardController {
    
    private final Board board;
    private final BoardView view;
    
    public BoardController(Board b, BoardView v) {
        this.board = b;
        this.view = v;
    }
    
    public Cell nextTurn(Player p) {
        Cell c = this.view.getNextMove(p, this.board);
        return c;
    }
    
    public boolean move(int row, int col, Player p) {
        int size = this.board.getSize();
        if ((row >= 0 && row <= size) && (col >= 0 && col <= size)) {
            try {
                Cell cell = this.board.getBoard()[row][col];
                if (cell.getType() == null) {
                    cell.setType(p.getPlayerType());
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException ae) {
                this.view.printErr("Cannot move to that position");
                ae.printStackTrace();
            }
        }
        return false;
    }

    public boolean checkForWin(Player p) {
        if (checkRows(p.getPlayerType()) || checkCols(p.getPlayerType()) || checkDiags(p.getPlayerType())) {
            return true;
        }
        return false;
    }

    public boolean checkRows(PlayerType t) {
        int size = this.board.getSize();
        for (int row = 0; row < size; row++) {
            PlayerType prev = this.board.getBoard()[row][0].getType();
            for (int col = 1; col < size; col++) {
                if (col == (size - 1) && (prev == this.board.getBoard()[row][col].getType())) {
                    return this.board.getBoard()[row][col].getType() == t;
                }
                prev = this.board.getBoard()[row][col].getType();
            }
        }
        return false;
    }

    public boolean checkCols(PlayerType t) {
        int size = this.board.getSize();
        for (int col = 0; col < size; col++) {
            PlayerType prev = this.board.getBoard()[0][col].getType();
            for (int row = 1; row < size; row++) {
                if (row == (size - 1) && (prev == this.board.getBoard()[row][col].getType())) {
                    return this.board.getBoard()[row][col].getType() == t;
                }
                prev = this.board.getBoard()[row][col].getType();
            }
        }
        return false;
    }

    public boolean checkDiags(PlayerType t) {
        return false;
    }

    public void clear() {
        this.board.clear();
    }
    
}
