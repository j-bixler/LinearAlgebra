import java.util.Arrays;

public class Matrix {

    /** Number of rows **/
    private final int numRows;
    /** Number of columns **/
    private final int numColumns;
    /** Internal representation of a matrix as array of column vectors **/
    private Vector[] vectors;

    /** Creates a Matrix in the order of columns, then rows.
     * @param numRows number of rows
     * @param numColumns number of columns
     * @param values matrix values in order of column 1, column 2, etc. **/
    public Matrix(int numRows, int numColumns, double[] values) {
        this.numRows = numRows;
        this.numColumns = numColumns;
    }

    public double get(int row, int column) {
        return this.vectors[column].get(row);
    }

    public double set(int index)


//    public boolean isDiagonalizable() {
//
//    }
//
//    public boolean isInvertible() {
//
//    }
//
//    public double determinant() {
//
//    }

}
