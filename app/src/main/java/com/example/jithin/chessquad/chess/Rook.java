package com.example.jithin.chessquad.chess;

import android.util.Log;

import static com.example.jithin.chessquad.chess.Utls.*;

/**
 * Created by jithin on 23/1/18.
 */

public class Rook extends Piece {

    public Rook(Board board, String piece, char side, int id){
        super(board, piece, side, id);
    }

    @Override
    public void addHighlight(){
        Log.d("Adding Highlight", "Rook");
        int y = intOf(this.Y)-1;
        int x = intOf(this.X);
        while (y >= 0){
            if(board.mtx[x][y]==null) {
                board.addHighlight(X, hex(y));
                y = y-1;
            }
            else if(board.mtx[x][y].side!='b'){
                board.addHighlight(X, hex(y));
                break;
            }
            else{ break; }
        }
        y = intOf(this.Y)+1;
        while (y <= 11){
            if(board.mtx[x][y]==null) {
                board.addHighlight(X, hex(y));
                y = y + 1;
            }
            else if(board.mtx[x][y].side!='b'){
                board.addHighlight(X, hex(y));
                break;
            }
            else{ break; }
        }
        y = intOf(this.Y);
        x = x - 1;
        while (x >= 0){
            if(board.mtx[x][y]==null){
                board.addHighlight(hex(x), Y);
                x = x - 1;
            }
            else if(board.mtx[x][y].side!='b'){
                board.addHighlight(hex(x), Y);
                break;
            }
            else{ break; }
        }
        x = intOf(X) + 1;
        while (x <= 11){
            if(board.mtx[x][y]==null){
                board.addHighlight(hex(x), Y);
                x = x + 1;
            }
            else if(board.mtx[x][y].side!='b'){
                board.addHighlight(hex(x), Y);
                break;
            }
            else { break; }
        }
    }
}