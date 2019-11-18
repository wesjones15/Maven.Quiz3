package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board[0].length];
        for (int i = 0; i < board[0].length; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return isHomogenous(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return isHomogenous(column);
    }

    public String getWinner() {
        if (isDiagonalHomogenous()) return getDiagonal()[0];
        if (isAntiDiagonalHomogenous()) return getAntiDiagonal()[0];
        for (int i = 0; i < board[0].length; i++) {
            if (isColumnHomogeneous(i)) return getColumn(i)[0];
            if (isRowHomogenous(i)) return getRow(i)[0];
        }
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }

    public Boolean isDiagonalHomogenous() {
        return isHomogenous(getDiagonal());
    }

    public Boolean isAntiDiagonalHomogenous() {
        return isHomogenous(getAntiDiagonal());
    }

    public Boolean isHomogenous(String[] array) {
        return Arrays.stream(array).filter(item -> item.equals(array[0])).count() == array.length;
    }

    public String[] getDiagonal() {
        String[] diagonal = new String[board[0].length];
        for (int i = 0; i < board[0].length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public String[] getAntiDiagonal() {
        String[] diagonal = new String[board[0].length];
        for (int i = 0; i < board[0].length; i++) {
            Integer index = board[0].length-1-i;
            diagonal[i] = board[index][i];
        }
        return diagonal;
    }
}
