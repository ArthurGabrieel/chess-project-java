package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char colmun, int row) {
        if (colmun < 'a' || colmun > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiang ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = colmun;
        this.row = row;
    }

    public char getColmun() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
