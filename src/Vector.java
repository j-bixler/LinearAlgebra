import java.util.function.Function;

public class Vector {
    /* Values in this Vector */
    private double[] values;
    /* 0: column, 1: row */
    private int shape;

    /** Representation of a vector
     * @param values array of elements of this vector
     * @param shape 0: column, 1: row
     */
    public Vector(double[] values, int shape) {
        this.values = values;
        this.shape = shape;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String sep = getShape() == 0 ? "\n" : " ";
        for (double val : getValues()) {
            sb.append(val).append(sep);
        }
        return sb.toString();
    }

    /** Scales vector by given amount
     * @param n amount to scale by
     */
    public void scale(double n) {
        apply((input -> input * n));
    }

    /** Returns new Vector of function applied to this Vector
     * @param function function to apply
     */
    public void apply(Function<Double, Double> function) {
        for (int i = 0; i < getValues().length; i++) {
            this.set(i, function.apply(get(i)));
        }
    }

    /** Transpose of this Vector **/
    public void transpose() {
        this.shape = Math.abs(this.shape - 1);
    }

    public void normalize() {
        scale(1 / getNorm());
    }

    /** Replaces value at index with new value
     *
     * @param index index of old value (zero-based)
     * @param value new value
     */
    public void set(int index, double value) {
        this.values[index] = value;
    }

    /** Returns value at given index (zero-based)
     * @param index index of value (zero-based)
     * @return value at index
     */
    public double get(int index) {
        return getValues()[index];
    }

    public Vector copy() {
        return new Vector(getValues(), getShape());
    }

    public double getNorm() {
        return Math.sqrt(Utils.dot(this, this));
    }

    public int size() {
        return getValues().length;
    }

    /** True iff the vector is a column vector **/
    public boolean isColumnVector() {
        return this.shape == 0;
    }

    /** True iff the Vector is a row vector. **/
    public boolean isRowVector() {
        return !isColumnVector();
    }

    /** True iff the Vector is a unit vector **/
    public boolean isUnit() {
        return Math.abs(1 - getNorm()) <= (1 / Math.pow(2, 53));
    }

    public int getShape() {
        return this.shape;
    }

    /** Getter for this.values **/
    public double[] getValues() {
        return this.values;
    }
}
