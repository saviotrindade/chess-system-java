package chess;

import boardgame.Piece;
import boardgame.Board;


public class ChessPiece extends Piece {

    private Color color;

    public Color getColor() {
        return this.color;
    }

    public ChessPiece (Board board, Color color) {
        super(board);
        this.color = color;
    }
}