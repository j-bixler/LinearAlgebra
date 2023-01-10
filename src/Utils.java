public class Utils {

    public static Vector add(Vector v, Vector u) {
        double[] vals = new double[v.size()];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = v.get(i) + u.get(i);
        }
        return new Vector(vals, v.getShape());
    }

    // Dot product implementation for vectors
    public static double dot(Vector v, Vector u){
        int result = 0;
        for (int i = 0; i < v.size(); i++) {
            result += v.get(i) * u.get(i);
        }
        return result;
    }


    public static boolean isOrthogonal(Vector v, Vector u) {
        return dot(v, u) == 0;
    }


    // PRIVATE HELPER METHODS

    /** Ensures that Vectors v and u have the same size and type throws DimensionException otherwise **/
    private static void validateDimensions(Vector v, Vector u) throws DimensionException {
        if (v.size() != u.size()) {
            throw new DimensionException(
                    String.format("vectors have different size: %d, %d",v.size(), u.size()));
        }

        if (v.getShape() != u.getShape()) {
            throw new DimensionException(
                    String.format("vectors have different shape, must be {row, row} or {column, column}"));
        }
    }
}
