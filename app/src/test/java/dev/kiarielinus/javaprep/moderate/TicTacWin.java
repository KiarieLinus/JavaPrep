package dev.kiarielinus.javaprep.moderate;

import java.util.ArrayList;
import java.util.Iterator;

//Tic Tac Win: Design an algorithm to figure out if someone has won a game of tic-tac-toe.
public class TicTacWin {
    enum Piece {Empty, Red, Blue}

    static Piece hasWon(Piece[][] board) {
        if (board.length != board[0].length) return Piece.Empty;
        int size = board.length;

        ArrayList<PositionIterator> instructions = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            instructions.add(new PositionIterator(new Position(0, i), 1, 0, size));//i column has won?
            instructions.add(new PositionIterator(new Position(i, 0), 0, 1, size));//i row has won?
        }
        instructions.add(new PositionIterator(new Position(0, 0), 1, 1, size));//Negative diagonal has won?
        instructions.add(new PositionIterator(new Position(0, size - 1), 1, -1, size));//positive diagonal has won?

        for (PositionIterator iterator : instructions) {
            Piece winner = hasWon(board,iterator);

            if(winner != Piece.Empty){
                return winner;
            }
        }
        return Piece.Empty;
    }

    static Piece hasWon(Piece[][] board, PositionIterator iterator) {
        Position firstPosition = iterator.next();
        Piece first = board[firstPosition.row][firstPosition.column];
        while (iterator.hasNext()) {
            Position position = iterator.next();
            if (board[position.row][position.column] != first) {
                return Piece.Empty;
            }
        }
        return first;
    }

    static class PositionIterator implements Iterator<Position> {
        private int rowIncrement, colIncrement, size;
        private Position current;

        public PositionIterator(Position p, int rowIncrement, int colIncrement, int size) {
            this.rowIncrement = rowIncrement;
            this.colIncrement = colIncrement;
            this.size = size;
            this.current = new Position(p.row - rowIncrement, p.column - colIncrement);
        }

        @Override
        public boolean hasNext() {
            return current.row + rowIncrement < size &&
                    current.column + colIncrement < size;
        }

        @Override
        public Position next() {
            current = new Position(current.row + rowIncrement,
                    current.column + colIncrement);
            return current;
        }
    }

    public static class Position {
        public int row, column;

        public Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public static void main(String[] args) {
        Piece[][] board = {
                {Piece.Red,Piece.Blue,Piece.Red},
                {Piece.Blue,Piece.Red,Piece.Empty},
                {Piece.Red,Piece.Blue,Piece.Blue},
        };

        System.out.println("Winner is: "+ hasWon(board));
    }
}
